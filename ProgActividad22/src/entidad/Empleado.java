package entidad;

public class Empleado {
	private int id;
	private String dni;
	private String nombre;
	private double sueldoBase;
	
	private static int contadorID;
	
	@Override
	public String toString() {
		return "Empleado [ID=" + id +", Dni=" + dni + ", nombre=" + nombre + ", sueldoBase=" + sueldoBase + "]";
	}
	
	public Empleado() {
		this.id = contadorID;
		contadorID++;
	}
	public int getId() {
		return id;
	}
	
	public static int getContadorID() {
		return contadorID;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni ;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public double salarioTotal() {
		return this.sueldoBase;
	}
	
	
	
	
}
