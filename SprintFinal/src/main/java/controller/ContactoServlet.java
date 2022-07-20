package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/contacto")
public class ContactoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactoServlet() {
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
		
		String ingreso = (String)s.getAttribute("ingreso");
		
		
		if (ingreso.equals("si")) {
		getServletContext().getRequestDispatcher("/view/contacto.jsp").forward(request, response);	
		} else {
			response.sendRedirect("Login");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String rut = (String)request.getParameter("rut");
		String nombre = (String)request.getParameter("nombre");
		String apellido = (String)request.getParameter("apellido");
		String mail = (String)request.getParameter("mail");
		String fono = (String)request.getParameter("fono");
		String mensaje = (String)request.getParameter("mensaje");
		
		System.out.println(" RUT: " + rut + " Nombre: " + nombre + " Apellido: " + apellido + " Correo: " + mail + " Teléfono: " + fono + " Mensaje: " + mensaje);
		
		
		doGet(request, response);
	}

}
