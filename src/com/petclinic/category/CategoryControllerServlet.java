package com.petclinic.category;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class CategoryControllerServlet
 */
@WebServlet("/CategoryControllerServlet")
public class CategoryControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private CategoryDbUtil categoryDbUtil;
	
	@Resource(name = "jdbc/pet_clinic")
	private DataSource dataSource;
	
	
       
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		try {
			categoryDbUtil = new CategoryDbUtil(dataSource);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryControllerServlet() {
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
				response.sendRedirect("VetControllerServlet");
				break;
			case "LIST":
				listCategories(request, response);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
	}

	private void listCategories(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Category> categories = categoryDbUtil.listCategories();
		
		request.setAttribute("LIST_CATEGORIES", categories);
		
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
				response.sendRedirect("VetControllerServlet");
				break;
			case "ADD":
				addCategory(request, response);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private void addCategory(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		
		categoryDbUtil.createCategory(name);
		
		response.sendRedirect("VetControllerServlet");
		
	}

}
