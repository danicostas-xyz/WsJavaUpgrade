package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletFormulario")
public class ServletFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entrando por doGet");
		
		//Recogemos los parameros del cliente
		String nombre = request.getParameter("nombre");
		System.out.println("Nombre: " + nombre);
		
		String edad = request.getParameter("edad");
		System.out.println("Edad: " + edad);
		
		String password = request.getParameter("pass");
		System.out.println("Password: " + password);
		
		String id = request.getParameter("identificador");
		System.out.println("Id: " + id);
		
		String estadoCivil = request.getParameter("estado_civil");
		System.out.println("estadoCivil: " + estadoCivil);
		
		String rango = request.getParameter("rango");
		System.out.println("rango: " + rango);
		
		String[] listaHobbies = request.getParameterValues("hobbies");
		System.out.println("Hobbies:");
		for(String h : listaHobbies) {
			System.out.println(h);
		}
		
		String dia = request.getParameter("dia_nacimiento");
		System.out.println("dia: " + dia);
		
		String obs = request.getParameter("observaciones");
		System.out.println("observaciones: " + obs);
		
		String terminos = request.getParameter("terminos");
		boolean bTerminos = false;
		if(terminos != null) {
			bTerminos = true;
		}
		System.out.println("terminos: " + bTerminos);
		
		response.getWriter().append("Valores: ");
		response.getWriter().append(nombre + ";");
		response.getWriter().append(edad + ";");
		response.getWriter().append(rango + ";");
		response.getWriter().append(id + ";");
		response.getWriter().append(estadoCivil + ";");
		response.getWriter().append(dia + ";");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entrando por doPost");
		
		doGet(request, response);
	}

}
