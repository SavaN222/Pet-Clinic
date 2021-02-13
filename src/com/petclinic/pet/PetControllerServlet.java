package com.petclinic.pet;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import java.util.List;

/**
 * Servlet implementation class PetControllerServlet
 */
@WebServlet("/PetControllerServlet")
public class PetControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PetDbUtil petDbUtil;
	
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
			default:
				break;
			}
		} catch (Exception e) {
			throw new ServletException(e);
		}
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
		
		petDbUtil.createPets(name, img, age, categoryId);
		
		listPets(request, response);
		
	}

}
