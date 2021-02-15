package com.petclinic.login;

import java.io.IOException;


import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;


import com.mysql.cj.Session;

/**
 * Servlet implementation class LoginControllerServlet
 */
@WebServlet("/LoginControllerServlet")
public class LoginControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginDbUtil loginDbUtil;

	@Resource(name = "jdbc/pet_clinic")
	private DataSource dataSource;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		try {
			loginDbUtil = new LoginDbUtil(dataSource);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginControllerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String command = request.getParameter("command");
			if (command == null) {
				command = "LOGOUT";
			}

			switch (command) {
			case "LOGOUT":
				logout(request, response);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0");
		response.setHeader("Pragma", "no-cache");
		response.setDateHeader("Expires", 0);
		HttpSession session = request.getSession();
		session.removeAttribute("id");
		session.invalidate();
		response.sendRedirect("login.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String command = request.getParameter("command");
			if (command == null) {
				command = "HOME";
			}
			
			switch (command) {
			case "LOGIN":
				login(request, response);
				break;
			case "HOME":
				logout(request, response);
				break;
		
			default:
				break;
			}
		} catch (Exception e) {
			throw new ServletException(e);
		}

	}
	
	private void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		int id = loginDbUtil.login(email, password);
		
		if (id < 1) {
			logout(request, response);
		} else {
				
			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
			response.addHeader("Cache-Control", "post-check=0, pre-check=0");
			response.setHeader("Pragma", "no-cache");
			response.setDateHeader("Expires", 0);
			
			HttpSession session = request.getSession();
			
			session.setAttribute("id", id);
			response.sendRedirect("VetControllerServlet");
		}

	
		
	}



}
