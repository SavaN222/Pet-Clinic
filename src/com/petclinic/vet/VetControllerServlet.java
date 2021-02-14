package com.petclinic.vet;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import javax.sql.DataSource;

/**
 * Servlet implementation class VetControllerServlet
 */
@WebServlet("/VetControllerServlet")
@MultipartConfig(fileSizeThreshold=1024*1024*2, // 2MB
maxFileSize=1024*1024*10,      // 10MB
maxRequestSize=1024*1024*50)
public class VetControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private VetDbUtil vetDbUtil;
	
	private static final String SAVE_DIR="images/vet";
	
	@Resource(name = "jdbc/pet_clinic")
	private DataSource dataSource;
	
	
       
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		try {
			vetDbUtil = new VetDbUtil(dataSource);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public VetControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String command = request.getParameter("command");
			if (command == null) {
				command = "HOME";
			}
			
			switch (command) {
			case "HOME":
				home(request, response);
				break;
			case "LIST":
				listVets(request, response);
				break;
			case "DELETE":
				deleteVets(request, response);
				break;
			case "EDIT":
				editVets(request, response);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private void editVets(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("vetId"));
		
		Vet vet = vetDbUtil.getVet(id);
		
		request.setAttribute("VET", vet);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/update-vet.jsp");
		requestDispatcher.forward(request, response);
		
	}

	private void deleteVets(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("vetId"));		
		
		vetDbUtil.deleteVet(id);
		
		listVets(request, response);
	}

	private void listVets(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Vet> vets = vetDbUtil.getVets();
		
		request.setAttribute("VET_LIST", vets);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/list-vet.jsp");
		requestDispatcher.forward(request, response);
		
	}

	private void home(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Vet vet = vetDbUtil.getVet((int) session.getAttribute("id"));
		
		request.setAttribute("VET", vet);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/dashboard.jsp");
		requestDispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String command = request.getParameter("command");
			if (command == null) {
				command = "HOME";
			}
			
			switch (command) {
			case "HOME":
				home(request, response);
				break;
			case "ADD":
				addVet(request, response);
				break;
			case "UPDATE":
				updateVet(request, response);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private void updateVet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		vetDbUtil.updateVet(id, firstName, lastName, email, password);
		
		listVets(request, response);
		
	}

	private void addVet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String img = request.getParameter("img");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		// image save //
				String savePath = "C:\\Users\\Korisnik\\eclipse-workspace\\Pet Clinic\\WebContent" + File.separator + SAVE_DIR; //specify your path here
		        File fileSaveDir=new File(savePath);
		        if(!fileSaveDir.exists()){
		            fileSaveDir.mkdir();
		        }

		        Part part = request.getPart("file");//
		        String fileName = extractFileName(part);//file name
		        part.write(savePath + File.separator + img + ".jpg");
		        String dbImage = "images/vet/" + img + ".jpg";
		
		vetDbUtil.createVet(firstName, lastName, dbImage, email, password);
		
		home(request, response);
		
	}

	// file name of the upload file is included in content-disposition header like this:
			//form-data; name="dataFile"; filename="PHOTO.JPG"
			private String extractFileName(Part part) {//This method will print the file name.
		        String contentDisp = part.getHeader("content-disposition");
		        String[] items = contentDisp.split(";");
		        for (String s : items) {
		            if (s.trim().startsWith("filename")) {
		                return s.substring(s.indexOf("=") + 2, s.length() - 1);
		            }
		        }
		        return "";
		    }

}
