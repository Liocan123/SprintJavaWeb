package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.service.AdministrativoService;
import model.service.AdministrativoServiceImpl;
import model.service.ClienteService;
import model.service.ClienteServiceImpl;
import model.service.ProfesionalService;
import model.service.ProfesionalServiceImpl;

/**
 * Servlet implementation class ListarUsuariosServlet
 */
@WebServlet("/ListadoDeUsuarios")
public class ListarUsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ClienteService service2 = new ClienteServiceImpl();
	private ProfesionalService service3 = new ProfesionalServiceImpl();
	private AdministrativoService service4 = new AdministrativoServiceImpl();
	
    public ListarUsuariosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession s = request.getSession();
		
		String ingreso = (String)s.getAttribute("ingreso");
		
		String op = (String)request.getParameter("op");
		
		if (s.getAttribute("ingreso") == null) {
			s.setAttribute("ingreso", "no");
		}
		
		if (ingreso.equals("si")) {
			
			
			switch (op) {
			case "ec": {
				
				s.setAttribute("op", op);
				
				request.setAttribute("clientes", service2.read());

				getServletContext().getRequestDispatcher("/view/ListadoDeUsuarios.jsp").forward(request, response);
				
				break;
			}
			
			case "ea": {
				s.setAttribute("op", op);
				
				request.setAttribute("administrativo", service4.read());

				getServletContext().getRequestDispatcher("/view/ListadoDeUsuarios.jsp").forward(request, response);
				
				break;
			}
			
			case "ep": {
				s.setAttribute("op", op);
				
				request.setAttribute("profesionales", service3.read());

				getServletContext().getRequestDispatcher("/view/ListadoDeUsuarios.jsp").forward(request, response);
				
				break;
			}
			
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
			}
			
			
			
			} else {
				response.sendRedirect("Login");
			}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

