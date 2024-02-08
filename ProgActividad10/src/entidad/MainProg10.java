package entidad;

public class MainProg10 {

	public static void main(String[] args) {
		Coche c1 = new Coche();
		c1.modelo = "Celica";
		c1.marca = "Toyota";
		c1.matricula = "4567-CTR";
		c1.peso = 1500;
		c1.antiguedad = 20;
		c1.esElectrico = false;//No hace falta porque por defecto es false
		
		System.out.println(c1);
		
		Coche c2 = new Coche();
		c2.modelo = "Lavadora 3";
		c2.marca = "Tesla";
		c2.matricula = "5678-TRW";
		c2.peso = 1700;
		c2.antiguedad = 15;
		c2.esElectrico = true;//No hace falta porque por defecto es false
		
		System.out.println(c2);
		
		Coche c3= new Coche();
		c3.modelo = "Megane";
		c3.marca = "Renault";
		c3.matricula = "0904-QVW";
		c3.peso = 1200;
		c3.antiguedad = 12;
		c3.esElectrico = false;//No hace falta porque por defecto es false
		
		/*
		System.out.println(c1.modelo);
		System.out.println(c1.marca);
		System.out.println(c1.matricula);
		System.out.println(c1.peso);
		System.out.println(c1.antiguedad);
		System.out.println(c1.esElectrico);
		
		System.out.println(c2.modelo);
		System.out.println(c2.marca);
		System.out.println(c2.matricula);
		System.out.println(c2.peso);
		System.out.println(c2.antiguedad);
		System.out.println(c2.esElectrico);
		
		System.out.println(c3.modelo);
		System.out.println(c3.marca);
		System.out.println(c3.matricula);
		System.out.println(c3.peso);
		System.out.println(c3.antiguedad);
		System.out.println(c3.esElectrico);
		*/
		imprimir(c1);
		imprimir(c2);
		imprimir(c3);
	}
	
	public static void imprimir(Coche coche) {
		System.out.println(coche.modelo);
		System.out.println(coche.marca);
		System.out.println(coche.matricula);
		System.out.println(coche.peso);
		System.out.println(coche.antiguedad);
		System.out.println(coche.esElectrico);
	}

	
	
}
