package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.entity.Capacitacion;
import model.service.CapacitacionService;
import model.service.CapacitacionServiceImpl;

/**
 * Servlet implementation class CrearCapacitacionServlet
 */
@WebServlet("/crearcapacitacion")
public class CrearCapacitacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private CapacitacionService service = new CapacitacionServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearCapacitacionServlet() {
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
		
		getServletContext().getRequestDispatcher("/view/crearcapacitacion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession s = request.getSession(true);
		
		if (s.getAttribute("ingreso") == null) {
			s.setAttribute("ingreso", "no");
		}
		
		String op = request.getParameter("op");
		String jsp = "/view/ListarCapacitaciones.jsp";
		
		Capacitacion capacitacion;
		if (op == null) {
			op = "new";
		}
		
		switch (op) {

		case "new":
			
			capacitacion = new Capacitacion();
			capacitacion.setIdentificador(Integer.parseInt(request.getParameter("identificador")));
			capacitacion.setRut(Integer.parseInt(request.getParameter("rut")));
			capacitacion.setDia(request.getParameter("dia"));
			capacitacion.setHora(request.getParameter("hora"));
			capacitacion.setLugar(request.getParameter("lugar"));
			capacitacion.setDuracion(request.getParameter("duracion"));
			capacitacion.setCantidadDeAsistentes(Integer.parseInt(request.getParameter("cantidadDeAsistentes")));
			
			service.create(capacitacion);
			
			break;
		default:
			break;
		}
		
		request.setAttribute("op", "list");		
		request.setAttribute("capacitaciones", service.read());
		getServletContext().getRequestDispatcher(jsp).forward(request, response);
		
		
		doGet(request, response);
	}

}
