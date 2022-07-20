package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession s = request.getSession(true);
	
		if (s.getAttribute("ingreso") == null) {
			s.setAttribute("ingreso", "no");
		}
		
		getServletContext().getRequestDispatcher("/view/Login.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String nombre = request.getParameter("nombre");
		String clave = request.getParameter("password");
		String tipoUsuario = request.getParameter("tipo");
		
		
		HttpSession s = request.getSession();
		s.setAttribute("nombre", nombre);
		s.setAttribute("password", clave);
		s.setAttribute("ingreso", "no");
		s.setAttribute("tipo", tipoUsuario);
		
		
		
		if (nombre.equals("admin") && clave.equals("1234")) {
			s.setAttribute("ingreso", "si");
			response.sendRedirect("index");
			 
		} else {
			getServletContext().getRequestDispatcher("/view/Login.jsp").forward(request, response);
			
		}
		
		
	}

}
