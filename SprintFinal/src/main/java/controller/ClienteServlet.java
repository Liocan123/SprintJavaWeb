package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.service.ClienteService;
import model.service.ClienteServiceImpl;


@WebServlet("/Cliente")
public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ClienteService service1 = new ClienteServiceImpl();
	
    public ClienteServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("clientes", service1.read());

		getServletContext().getRequestDispatcher("/view/Cliente.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
