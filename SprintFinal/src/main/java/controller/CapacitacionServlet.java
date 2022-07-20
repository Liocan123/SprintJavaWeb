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


@WebServlet("/ListarCapacitaciones")
public class CapacitacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private CapacitacionService service = new CapacitacionServiceImpl();
    public CapacitacionServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession s = request.getSession(true);
		
		if (s.getAttribute("ingreso") == null) {
			s.setAttribute("ingreso", "no");
		}
		
		String op = request.getParameter("op");
		String jsp = "";
		
		if (op==null) {
			op = "list";
		}
		
		switch (op) {
		case "list": {
			request.setAttribute("capacitaciones", service.read());
			jsp = "/view/ListarCapacitaciones.jsp";
			break;
		}

		case "new":{
			
			jsp = "/view/CrearCapacitaciones.jsp";
			
			break;
		}
		

		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}

		request.setAttribute("op", op);		
		getServletContext().getRequestDispatcher(jsp).forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
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
		request.setAttribute("films", service.read());
		getServletContext().getRequestDispatcher(jsp).forward(request, response);
		
		
	}

}
