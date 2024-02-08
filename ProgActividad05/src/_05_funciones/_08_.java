package _05_funciones;
/*
 * Ej08. Un alumno desea saber cuál será su calificación final en la materia de programación. Dicha calificación se compone de los siguientes porcentajes: 

55% del promedio de sus tres calificaciones parciales (parámetros de entrada)
30% de la calificación del examen final (parámetro de entrada)
15% de la calificación de un trabajo final (parámetro de entrada)
Crear una función que calcule la nota final (parámetro de salida) del alumno en base a los porcentajes anteriores.

Una vez creada la función, llamar a la función 2 veces desde el método "main" con parámetros de entrada diferentes.
 */
public class _08_ {

	public static void main(String[] args) {
		double notaPromedio=notaParcial(7, 6, 8, 8, 7);
		System.out.println("La nota final es " +notaPromedio);
		
		notaPromedio=notaParcial(5, 5, 5, 5, 5);
		System.out.println("La nota final es " +notaPromedio);
		
	}
	
	public static double notaParcial (double parcial1, double parcial2, double parcial3, double examen, double trabajo) {
		double notaPromedioParciales= ((parcial1 + parcial2 + parcial3) / 3) * 0.55;
		double examenFinal = examen * 0.3;
		double trabajoFinal= trabajo * 0.15;
		double notaDefinitiva= notaPromedioParciales + examenFinal + trabajoFinal;
		return notaDefinitiva;
	}
	
}