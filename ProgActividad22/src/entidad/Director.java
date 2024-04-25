package entidad;

import java.util.ArrayList;

public class Director extends Empleado {
	
	private ArrayList<Empleado> listaEmpleados;
	
	public Director() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	@Override
	public String toString() {
		return "Director [listaEmpleados=" + listaEmpleados + ", toString()=" + super.toString() + "]";
	}

	public double salarioTotal(){
		
		return this.getSueldoBase() + (100 * this.listaEmpleados.size());
	}



	

	




	
	

}
