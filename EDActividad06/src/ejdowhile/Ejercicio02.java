package ejdowhile;

public class Ejercicio02 {
	public static void main(String[] args) {
		
		//Con bucles
		for(int i = 10; i >= 1; i--) {
			System.out.println("Numero: " + i);
		}
		
		int i = 10;
		
		do {
			System.out.println(i--);
		}while(i >=1);
		

	}
}
