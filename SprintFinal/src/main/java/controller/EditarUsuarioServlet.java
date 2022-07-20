package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.entity.Administrativo;
import model.entity.Cliente;
import model.entity.Profesional;
import model.service.AdministrativoService;
import model.service.AdministrativoServiceImpl;
import model.service.ClienteService;
import model.service.ClienteServiceImpl;
import model.service.ProfesionalService;
import model.service.ProfesionalServiceImpl;


@WebServlet("/EditarUsuario")
public class EditarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ClienteService service10 = new ClienteServiceImpl();
	private ProfesionalService service20 = new ProfesionalServiceImpl();
	private AdministrativoService service30 = new AdministrativoServiceImpl();

 
    public EditarUsuarioServlet() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession s = request.getSession();
		String op = (String)request.getParameter("op");
		
		
		if (s.getAttribute("ingreso") == null) {
			s.setAttribute("ingreso", "no");
		}
		
		switch (op) {
		case "cc": {
			s.setAttribute("op", op);
			
			String idUsuario = request.getParameter("idUsuario");
			request.setAttribute("cliente", service10.read(Integer.parseInt(idUsuario)));
			
			getServletContext().getRequestDispatcher("/view/EditarUsuario.jsp").forward(request, response);
			
			break;
		}
		
		case "ca":{
			s.setAttribute("op", op);
			
			String idUsuario = request.getParameter("idUsuario");
			request.setAttribute("administrativo", service30.read(Integer.parseInt(idUsuario)));
			
			getServletContext().getRequestDispatcher("/view/EditarUsuario.jsp").forward(request, response);
			
			
			break;
		}
		
		case "cp":{
			s.setAttribute("op", op);
			
			String idUsuario = request.getParameter("idUsuario");
			request.setAttribute("profesional", service20.read(Integer.parseInt(idUsuario)));
			
			getServletContext().getRequestDispatcher("/view/EditarUsuario.jsp").forward(request, response);
			
			
			
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}
		
		
	}
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession s = request.getSession();
		String op = (String)request.getParameter("op");
		s.setAttribute("op", op);
		
		switch (op) {
		case "cc": {
			s.setAttribute("op", op);
			Cliente cliente;
			
			cliente = service10.read(Integer.parseInt(request.getParameter("rut")));
			
			//film.setFilm_id(Integer.parseInt(request.getParameter("film_id")));
			
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
			

			service10.update(cliente);
			
			doGet(request, response);
			
			break;
		}
		
		case "ca":{
			s.setAttribute("op", op);
			
			Administrativo administrativo;
			
			administrativo = service30.read(Integer.parseInt(request.getParameter("run")));
			
			//film.setFilm_id(Integer.parseInt(request.getParameter("film_id")));
			
			administrativo.setRun(Integer.parseInt(request.getParameter("run")));
			administrativo.setNombre(request.getParameter("nombreU"));
			administrativo.setFechaDeNacimiento(request.getParameter("fechaN"));
			administrativo.setArea(request.getParameter("area"));
			administrativo.setExperienciaPrevia(request.getParameter("exp"));
			
			service30.update(administrativo);
			
			doGet(request, response);
			
			
			
			
			break;
		}
		
		case "cp":{
			s.setAttribute("op", op);
			
			Profesional profesional;
			
			 profesional = service20.read(Integer.parseInt(request.getParameter("run")));
			
			//film.setFilm_id(Integer.parseInt(request.getParameter("film_id")));
			 profesional.setRun(Integer.parseInt(request.getParameter("run")));
			 profesional.setNombre(request.getParameter("nombreU"));
			 profesional.setFechaDeNacimiento(request.getParameter("fechaN"));
			 profesional.setTitulo(request.getParameter("titulo"));
			 profesional.setFechaDeIngreso(request.getParameter("ingreso"));
			
			service20.update(profesional);
			
			doGet(request, response);
			
			
			
			
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}
		
		
	}
		

		
		
	}
