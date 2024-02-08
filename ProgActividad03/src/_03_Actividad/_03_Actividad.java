package _03_Actividad;

public class _03_Actividad {

	public static void main(String[] args) {
		//Entero a Float
		int numeroEntero = 22;
		//Lo que esta en una caja pequeña siempre entra en una caja grande
		//NO hace falta hacer un casting
		float numeroFloat = numeroEntero;		
		System.out.println(numeroFloat);
		//No hace falta hacer casting, ni se pierde información.
		
		//De float a entero
		numeroFloat = 2F;
		//Siempre que queramos pasar lo que haya de una caja grande a una caja
		//pequeña, es obligatorio hacer un casting. NO importa que el valor
		//que tenga la caja grande entre en la pequeña
		int numeroEntero2 = (int)numeroFloat;
		System.out.println(numeroEntero2);
		//Se puede cambiar haciendo casting, pero puede pierde información. Pierde el decimal.
		
		//De double a entero
		double numeroDouble = 3.3;
		int numeroEntero3 = (int)numeroDouble;
		System.out.println(numeroEntero3);
		//Deja hacerlo haciendo casting, pero una vez más pierde el valor decimal.
		
		//De entero a double
		numeroEntero3 = 80;
		double numeroDouble2 = numeroEntero3;
		System.out.println(numeroDouble2);
		//Se puede hacer sin casting y no pierde información.
		
		//De char a entero
		char variableChar = 'a';
		int numeroEntero4 = variableChar;
		System.out.println(numeroEntero4);
		//Se puede hacer sin casting, te transforma el caracter a su código ascii
		
		//De enteros a char
		numeroEntero4 = 99;
		char variableChar2 = (char)numeroEntero4;
		System.out.println(variableChar2);
		//Se puede hacer con casting, transforma de códico ascii a caracter.
		
		//De cadenas a entero
		String variableString1 = "S";
		//int numeroEntero5 = variableString1;//Error
		//int numeroEntero5 = (int)variableString1;//Da error hasta haciendo casting
		
		//De cadena a caracter
		//char variableChar1 = (char)variableString1;//Error. Ni haciendo casting
		//char variableChar1 = variableString1;//Error
	}

}
