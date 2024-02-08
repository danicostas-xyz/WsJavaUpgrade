package _05_funciones;
/*
Ej09. Un trabajador desea saber su sueldo total. Su sueldo total se basa en lo siguiente

Salario base (parámetro de entrada)
Número de horas extra trabajadas (parámetro de entrada)
Precio de hora extra trabajada (parámetro de entrada)
Crear una función que imprima por pantalla el salario del trabajador según los parámetros de entrada anteriores.

Una vez creada la función, llamar a la función 2 veces desde el método "main" con parámetros de entrada diferentes. */
public class _09_ {

	public static void main(String[] args) {
		calcularSalarioTotal(1000, 6, 10);
		calcularSalarioTotal(1500, 5, 5);
	}
	
	public static void calcularSalarioTotal (double salarioBase, 
											 double horasExtra, 
											 double precioHoraExtra) {
		double salarioTotal = (salarioBase + (horasExtra * precioHoraExtra));
		System.out.println("El salario total es: " + salarioTotal);		
	}	
}