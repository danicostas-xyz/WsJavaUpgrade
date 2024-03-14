package entidad;

public class Coche {
	private int id;
	private String matricula;
	private String marca;
	
	private static int contadorID;
	
	public static final String TOYOTA = "Toyota";
	public static final String RENAULT = "Renault";
	
	public Coche() {
		this.id = contadorID;
		contadorID++;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public static int getContadorID() {
		return contadorID;
	}

	@Override
	public String toString() {
		return "Coche [id=" + id + ", matricula=" + matricula + ", marca=" + marca + "]";
	}
	
	public static void mostrarContadorID() {
		System.out.println(contadorID);
	}
	
	public static void resetarContadorID() {
		contadorID = 0;
	}
}
