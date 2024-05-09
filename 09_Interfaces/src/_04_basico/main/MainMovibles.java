package _04_basico.main;

import _04_basico.animales.Animal;
import _04_basico.animales.Cangrejo;
import _04_basico.animales.Leon;
import _04_basico.animales.Sexo;
import _04_basico.animales.Tiburon;
import _04_basico.animales.Trucha;

public class MainMovibles {

	public static void main(String[] args) {
		Animal t = new Trucha();
		t.setNombre("Robustiana");
		t.setPeso(2.2);
		t.setSexo(Sexo.NO_BINARIO);
		t.setEdad(1);
		//Normalmente cuando creamos un objeto usaremos
		//una referencia de su propio tipo, ya que si no
		//debemos de hacer un casting
		//t.setNumeroAletas()
		Trucha trucha = (Trucha)t;
		trucha.setNumeroAletas(2);
		
		Cangrejo c = new Cangrejo();
		c.setNombre("Sebastian");
		c.setEdad(4);
		c.setNumeroAletas(0);
		c.setPeso(0.2);
		c.setSexo(Sexo.HERMAFRODITA);
		
		Leon l = new Leon();
		l.setNombre("Simba");
		l.setEdad(5);
		l.setPeso(180);
		l.setSexo(Sexo.MASCULINO);
		
		Tiburon tiburon = new Tiburon();
		tiburon.setNombre("Lorenzo");
		tiburon.setPeso(480);
		tiburon.setEdad(3);
		tiburon.setSexo(Sexo.FLUIDO);

	}

}
