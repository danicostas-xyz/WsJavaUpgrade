package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletToJSP")
public class ServletToJSP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Recibiendo petición de nuestro cliente");
		String param1 = request.getParameter("primo2");
		int numero = Integer.parseInt(param1);
		boolean esPrimo = esPrimo(numero);
		
		System.out.println("Es primo? " + esPrimo);
		
		//Vamos a reenviar la información al JSP
		//Primero despachamos la URL al JSP
		request.setAttribute("resultado", esPrimo);
		request.getRequestDispatcher("segundoJSP.jsp").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private boolean esPrimo(int n) {
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
