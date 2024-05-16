package operaciones;

public class Matematicas {
	public static int sumar(int n1, int n2) {
		return n1 + n2;
	}
	public static int restar(int n1, int n2) {
		return n1 - n2;
	}
	public static int multiplicar(int n1, int n2) {
		return n1 * n2;
	}
	//Con esto hacemos que el usuario tenga que controlar las excepciones
	public static int dividir(int n1, int n2) throws Exception{
		return n1 / n2;
	}
}
