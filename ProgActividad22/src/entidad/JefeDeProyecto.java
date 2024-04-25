package entidad;

public class JefeDeProyecto extends Empleado {
	
	private double incentivo;
	
	

	@Override
	public String toString() {
		return "JefeDeProyecto [incentivo=" + incentivo + ", " + super.toString() + "]";
	}



	public double getIncentivo() {
		return incentivo;
	}



	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}



	public JefeDeProyecto() {
		
	}


	@Override
	public double salarioTotal() {
		return this.getSueldoBase() + this.incentivo;
	}
	
	

}
