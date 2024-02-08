
public class Ej02_FiguraGeometrica {

	public static void main(String[] args) {
		System.out.println("--------------------------------------------");
		System.out.println("CALCULADORA DE AREAS");

		System.out.println("El area del cuadrado es:" + calculoArea(7F));
		System.out.println("--------------------------------------------");

		System.out.println("El area del tríangulo es:" + calculoArea(20, 7));
		System.out.println("--------------------------------------------");

		System.out.println("El area del círculo es:" + calculoArea(5.0));
		System.out.println("--------------------------------------------");

	}

	public static float calculoArea(float lado) {
		float area = lado * lado;
		return area;
	}

	public static double calculoArea(double base, double altura) {
		double area = (base * altura) / 2;
		return area;
	}

	public static double calculoArea(double radio) {
		final double PI = 3.1416;
		double area = PI * (radio * radio);
		return area;
	}
}