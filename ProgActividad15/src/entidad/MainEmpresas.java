package entidad;

import java.util.ArrayList;

public class MainEmpresas {

	public static void main(String[] args) {
		ArrayList<Empresa> listaEmpresas = new ArrayList<>();
		
		Trabajador t1 = new Trabajador();
		t1.setNombre("Son Goku");
		t1.setDni("444337523G");
		t1.setSalario(1000);
		
		Trabajador t2 = new Trabajador();
		t2.setNombre("Vegeta");
		t2.setDni("678888787T");
		t2.setSalario(1500);
		
		Trabajador t3 = new Trabajador();
		t3.setNombre("Son Gohan");
		t3.setDni("98988397F");
		t3.setSalario(2500);
		
		Trabajador t4 = new Trabajador();
		t4.setNombre("Yamcha");
		t4.setDni("90999999F");
		t4.setSalario(1100);
		
		Trabajador t5 = new Trabajador();
		t5.setNombre("Mr. Satan");
		t5.setDni("111111111R");
		t5.setSalario(3500);
		
		Trabajador t6 = new Trabajador();
		t6.setNombre("Pikolo");
		t6.setDni("333333333D");
		t6.setSalario(1700);
		
		ArrayList<Trabajador> listaTrabajadores1 = new ArrayList<Trabajador>();
		listaTrabajadores1.add(t1);
		listaTrabajadores1.add(t6);
		listaTrabajadores1.add(t5);
 
		ArrayList<Trabajador> listaTrabajadores2 = new ArrayList<Trabajador>();
		listaTrabajadores2.add(t2);
		listaTrabajadores2.add(t3);
		listaTrabajadores2.add(t4);
		
		Empresa e = new Empresa();
		e.setNombre("Las bolas del dragon");
		e.setNIF("45687834K");
		e.setListaTrabajadores(listaTrabajadores1);
		
		listaEmpresas.add(e);
		
		e = new Empresa();
		e.setNombre("Mr. Sushi");
		e.setNIF("5646464646P");
		e.setListaTrabajadores(listaTrabajadores2);
		
		listaEmpresas.add(e);
		
		for(Empresa empresa : listaEmpresas) {
			System.out.println(empresa);
			empresa.mostrarTrabajores();
			System.out.println(empresa.existeTrabajador("111111111R"));
			System.out.println(empresa.existeTrabajador("111111134R"));
			System.out.println(empresa.devolverNumeroTrabajadores());
			System.out.println(empresa.devolverSalarioTotalTrabajadores());
			System.out.println(empresa.devolverNumeroTrabajadoresSalarioMas3000());
			System.out.println(empresa.devolverNumeroTrabajadoresSalarioMenorSMI());
			System.out.println(empresa.devolverNumeroTrabajadores(1500));
			System.out.println(empresa.comprobarDNITrabajadores());
			System.out.println(empresa.esIgual(e));
			System.out.println("--------------------------------");
		}
	}

}
