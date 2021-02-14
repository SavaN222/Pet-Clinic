package com.petclinic.pet;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.sql.DataSource;

import java.util.List;

/**
 * Servlet implementation class PetControllerServlet
 */
@WebServlet("/PetControllerServlet")
@MultipartConfig(fileSizeThreshold=1024*1024*2, // 2MB
maxFileSize=1024*1024*10,      // 10MB
maxRequestSize=1024*1024*50)
public class PetControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PetDbUtil petDbUtil;
	private static final String SAVE_DIR="images/pets";
	@Resource(name = "jdbc/pet_clinic")
	private DataSource dataSource;
	
	
       
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		try {
			petDbUtil = new PetDbUtil(dataSource);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public PetControllerServlet() {
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
				command = "LIST";
			}
			
			switch (command) {
			case "LIST":
				listPets(request, response);
				break;
			case "DELETE":
				deletePet(request, response);
				break;
			case "EDIT":
				editPets(request, response);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private void editPets(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("petId"));
		
		Pet pet = petDbUtil.getPet(id);
		
		request.setAttribute("PET", pet);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/update-pet.jsp");
		requestDispatcher.forward(request, response);
		
	}
	
	private void deletePet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("petId"));		
		
		petDbUtil.deletePet(id);
		
		listPets(request, response);
	}
	
	private void listPets(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Pet> pets = petDbUtil.getPets();
		
		request.setAttribute("PET_LIST", pets);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/list-pets.jsp");
		requestDispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String command = request.getParameter("command");
			
			switch (command) {
			case "ADD":
				createPet(request, response);
				break;
			case "UPDATE":
				updatePet(request, response);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private void createPet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String img = request.getParameter("img");
		int age = Integer.parseInt(request.getParameter("age"));
		int categoryId = Integer.parseInt(request.getParameter("categoryId"));
		
		// image save //
		String savePath = "C:\\Users\\Korisnik\\eclipse-workspace\\Pet Clinic\\WebContent" + File.separator + SAVE_DIR; //specify your path here
        File fileSaveDir=new File(savePath);
        if(!fileSaveDir.exists()){
            fileSaveDir.mkdir();
        }

        Part part = request.getPart("file");//
        String fileName = extractFileName(part);//file name
        part.write(savePath + File.separator + img + ".jpg");
        String dbImage = "images/pets/" + img + ".jpg";
		
		petDbUtil.createPets(name, dbImage, age, categoryId);
		
		listPets(request, response);
	}
	
	private void updatePet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String img = request.getParameter("img");
		int age = Integer.parseInt(request.getParameter("age"));
		int categoryId = Integer.parseInt(request.getParameter("categoryId"));
		
		// image save //
				String savePath = "C:\\Users\\Korisnik\\eclipse-workspace\\Pet Clinic\\WebContent" + File.separator + SAVE_DIR; //specify your path here
		        File fileSaveDir=new File(savePath);
		        if(!fileSaveDir.exists()){
		            fileSaveDir.mkdir();
		        }

		        Part part = request.getPart("file");//
		        String fileName = extractFileName(part);//file name
		        part.write(savePath + File.separator + img + ".jpg");
		        String dbImage = "images/pets/" + img + ".jpg";
		
		petDbUtil.updatePet(id, name, dbImage, age, categoryId);
		
		listPets(request, response);
		
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
