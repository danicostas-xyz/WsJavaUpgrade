package entidad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Trabajador {
	private String dni;
	private String nombre;
	private double salario;
	
	public Trabajador() {
		super();
	}
	
	public Trabajador(String dni, String nombre, double salario) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.salario = salario;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Trabajador [dni=" + dni + ", nombre=" + nombre + ", salario=" + salario + "]";
	}
	
	public boolean esDNIValido() {
		String regex = "\\d{8}[A-HJ-NP-TV-Z]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(this.dni);
		return matcher.matches();
	}
	
	public boolean ganaMas(Trabajador t) {
		if(this.salario > t.salario) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean esIgual(Trabajador t) {
		if(!this.nombre.equals(t.nombre)) {
			return false;
		}
		
		if(!this.dni.equals(t.dni)) {
			return false;
		}
		
		if(this.salario != t.salario) {
			return false;
		}
		
		return true;
	}
}
