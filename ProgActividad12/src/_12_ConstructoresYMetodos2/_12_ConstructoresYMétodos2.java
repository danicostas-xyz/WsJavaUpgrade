package _12_ConstructoresYMetodos2;

public class _12_ConstructoresYMétodos2 {
	
	public static void main(String[] args) {
		
		Coche c1 = new Coche(9873424, "Nissan", "AG91713", 450, "25/05/2024", 400);
		Coche c2 = new Coche();
		
		//Falta recoger los valores de los coches
		
		System.out.println(c1.toString());
		c1.precioBase();
		c1.anioDeMatriculacion();
		c1.fechaBisiesto();
		System.out.println("El precio de tu coche con " + c1.kilometros + " es de " + c1.precio() + "€");
		System.out.println("Tu coche tiene una cantidad de kilómetros cuyo valor es primo? " + c1.esPrimo());
		if (c1.esPrimo()) {
			System.out.println("La cantidad de kilómetros de tu coche es una cantidad de valor primo");
		} else{
			System.out.println("La cantidad de kilómetros de tu coche es una cantidad de valor no primo");
		}
		if (c1.faltaPara200000() > 0) {
			System.out.println("Le faltan " + c1.faltaPara200000() + " kilómetros para llegar a 200.000km");
		} else {
			c1.faltaPara200000();
		}
		System.out.println("La marca y modelo de tu coche tiene " + c1.numeroDeCaracteres() + " caracteres");
		c2.precioBase = 500;
		double diferenciaDeKM = c1.diferenciaDeKM(c2);
		if (diferenciaDeKM < 0) {
			System.out.println("Tienen una diferencia de " + diferenciaDeKM * 1 + "KM");
		} else if (diferenciaDeKM == 0) {
			System.out.println("Tienen la misma cantidad de KM");
		} else {
			System.out.println("Tienen una diferencia de " + diferenciaDeKM + "KM");
		}
		c2.precioBase = 1500;
		boolean esMayor = c1.esMasCaro(c2);
		System.out.println(esMayor);
		System.out.println(c1.esMasCaroOIgual(c2));
	}

}