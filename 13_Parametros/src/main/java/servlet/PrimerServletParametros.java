package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrimerServletParametros")
public class PrimerServletParametros extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//http://localhost:8080/13_Parametros/PrimerServletParametros?parametro1=guillermo&parametro2=armario
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entrando por el doGet...");
		
		String param1 = request.getParameter("parametro1");
		System.out.println("El parametro 1 que me ha llegado es: " + param1);
		
		String param2 = request.getParameter("parametro2");
		System.out.println("El parametro 2 que me ha llegado es: " + param2);
		
		
		response.getWriter().append("Parametro1: " + param1 + ";");
		response.getWriter().append("Parametro2: " + param2);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
