package ejwhile;


public class Ejercicio04 {
	public static void main(String[] args) {
		
		long acumulador = 0;
		int i = 1;
		
		while(i <= 100) {
			acumulador = acumulador + i;
			i++;
		}
		
		System.out.println(acumulador);
	}
}
