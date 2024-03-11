package entidad;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private String NIF;
	private ArrayList<Trabajador> listaTrabajadores;
	
	public static final double SMI = 1134;
	
	public Empresa() {
		super();
	}

	public Empresa(String nombre, String NIF, ArrayList<Trabajador> listaTrabajadores) {
		super();
		this.nombre = nombre;
		this.NIF = NIF;
		this.listaTrabajadores = listaTrabajadores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String NIF) {
		this.NIF = NIF;
	}

	public ArrayList<Trabajador> getListaTrabajadores() {
		return listaTrabajadores;
	}

	public void setListaTrabajadores(ArrayList<Trabajador> listaTrabajadores) {
		this.listaTrabajadores = listaTrabajadores;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", NIF=" + NIF + ", listaTrabajadores=" + listaTrabajadores + "]";
	}
	
	public void mostrarTrabajores() {
		for(Trabajador t : listaTrabajadores) {
			System.out.println(t);
		}
	}
	
	public boolean existeTrabajador(String DNI) {
		for(Trabajador t : listaTrabajadores) {
			if(t.getDni().equals(DNI)) {
				return true;
			}
		}
		return false;
	}
	
	public int devolverNumeroTrabajadores() {
		return this.listaTrabajadores.size();
	}
	
	public double devolverSalarioTotalTrabajadores() {
		double salarioTotal = 0.0;
		for(Trabajador t : listaTrabajadores) {
			salarioTotal += t.getSalario();
		}
		return salarioTotal;
	}
	
	public int devolverNumeroTrabajadores(double salario) {
		int contador = 0;
		for(Trabajador t : listaTrabajadores) {
			if(t.getSalario() > salario) {
				contador++;
			}
		}
		return contador;
	}
	
	public int devolverNumeroTrabajadoresSalarioMas3000() {
		return devolverNumeroTrabajadores(3000);
	}
	
	public int devolverNumeroTrabajadoresSalarioMenorSMI() {
		int contador = 0;
		for(Trabajador t : listaTrabajadores) {
			if(t.getSalario() < SMI) {
				contador++;
			}
		}
		return contador;
	}
	
	public boolean comprobarDNITrabajadores() {
		for(Trabajador t : listaTrabajadores) {
			if(!t.esDNIValido()) {
				return false;
			}
		}
		return true;
	}
	
	public boolean esIgual(Empresa e) {
		if(!this.nombre.equals(e.nombre)) {
			return false;
		}
		
		if(!this.NIF.equals(e.NIF)) {
			return false;
		}
		
		return true;
	}
}
