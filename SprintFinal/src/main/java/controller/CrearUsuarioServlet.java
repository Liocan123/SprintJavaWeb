package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.entity.Administrativo;
import model.entity.Capacitacion;
import model.entity.Cliente;
import model.entity.Profesional;
import model.service.AdministrativoService;
import model.service.AdministrativoServiceImpl;
import model.service.CapacitacionService;
import model.service.CapacitacionServiceImpl;
import model.service.ClienteService;
import model.service.ClienteServiceImpl;
import model.service.ProfesionalService;
import model.service.ProfesionalServiceImpl;

/**
 * Servlet implementation class CrearUsuarioServlet
 */
@WebServlet("/CrearUsuario")
public class CrearUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ClienteService service = new ClienteServiceImpl();
	private ProfesionalService service2 = new ProfesionalServiceImpl();
	private AdministrativoService service3 = new AdministrativoServiceImpl();
	
    public CrearUsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession s = request.getSession();
		
		String ingreso = (String)s.getAttribute("ingreso");
		
		String op = (String)request.getParameter("op");
		
		if (s.getAttribute("ingreso") == null) {
			s.setAttribute("ingreso", "no");
		}
		
		if (ingreso.equals("si")) {
			
			s.setAttribute("op", op);

			getServletContext().getRequestDispatcher("/view/CrearUsuario.jsp").forward(request, response);
			
			} else {
				response.sendRedirect("Login");
			}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession s = request.getSession();
		String op = (String)request.getParameter("op");
		
		if (s.getAttribute("ingreso") == null) {
			s.setAttribute("ingreso", "no");
		}
		
		switch (op) {
		case "cc": {
			
			Cliente cliente = new Cliente();
			cliente.setRun(Integer.parseInt(request.getParameter("run")));
			cliente.setNombre(request.getParameter("nombreU"));
			cliente.setFechaDeNacimiento(request.getParameter("fechaN"));
			cliente.setRut(Integer.parseInt(request.getParameter("rut")));
			cliente.setNombres(request.getParameter("nombreC"));
			cliente.setApellidos(request.getParameter("apellidoC"));
			cliente.setTelefono(request.getParameter("tel"));
			cliente.setAfp(request.getParameter("afp"));
			cliente.setSistemaDeSalud(Integer.parseInt(request.getParameter("sSalud")));
			cliente.setDireccion(request.getParameter("direccion"));
			cliente.setComuna(request.getParameter("comuna"));
			
			
			service.create(cliente);
			
			
			doGet(request, response);
			
			break;
		}
		
		case "ca":{
			
			Administrativo administrativo = new Administrativo();
			
			administrativo.setRun(Integer.parseInt(request.getParameter("run")));
			administrativo.setNombre(request.getParameter("nombreU"));
			administrativo.setFechaDeNacimiento(request.getParameter("fechaN"));
			administrativo.setArea(request.getParameter("area"));
			administrativo.setExperienciaPrevia(request.getParameter("exp"));
			
			service3.create(administrativo);
			
			doGet(request, response);
			
			
			break;
		}
		
		case "cp":{
			
			Profesional profesional = new Profesional();
			profesional.setRun(Integer.parseInt(request.getParameter("run")));
			profesional.setNombre(request.getParameter("nombreU"));
			profesional.setFechaDeNacimiento(request.getParameter("fechaN"));
			profesional.setTitulo(request.getParameter("titulo"));
			profesional.setFechaDeIngreso(request.getParameter("ingreso"));
			
			
			
			service2.create(profesional);
			
			
			doGet(request, response);
			
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}
		
		
	}

}
