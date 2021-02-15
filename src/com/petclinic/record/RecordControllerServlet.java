package com.petclinic.record;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.petclinic.pet.Pet;
import com.petclinic.pet.PetDbUtil;

import java.util.*;

/**
 * Servlet implementation class RecordControllerServlet
 */
@WebServlet("/RecordControllerServlet")
public class RecordControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private RecordDbUtil recordDbUtil;
	private PetDbUtil petDbUtil;
	
	@Resource(name = "jdbc/pet_clinic")
	private DataSource dataSource;
	
	
       
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		try {
			recordDbUtil = new RecordDbUtil(dataSource);
			petDbUtil = new PetDbUtil(dataSource);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public RecordControllerServlet() {
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
				command = "SHOW";
			}
			
			switch (command) {
			case "SHOW":
				showRecordsForPet(request, response);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private void showRecordsForPet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int petId = Integer.parseInt(request.getParameter("petId"));
		
		List<Record> medicalRecors = recordDbUtil.getRecordsForPet(petId);
		Pet pet = petDbUtil.getPet(petId);
		
		request.setAttribute("SHOW_RECORDS", medicalRecors);
		request.setAttribute("PET", pet);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/records.jsp");
		
		requestDispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
