package com.petclinic.vet;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

/**
 * Servlet implementation class VetControllerServlet
 */
@WebServlet("/VetControllerServlet")
public class VetControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private VetDbUtil vetDbUtil;
	
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
			default:
				break;
			}
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private void home(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Vet vet = vetDbUtil.getVet((int) session.getAttribute("id"));
		
		request.setAttribute("VET", vet);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/welcome.jsp");
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
			default:
				break;
			}
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private void addVet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		vetDbUtil.createVet(firstName, lastName, email, password);
		
		home(request, response);
		
	}


}
