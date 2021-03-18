package ro.ase.cts.program;

import ro.ase.cts.clase.ManagerSpital;
import ro.ase.cts.clase.ManagerSpitalLazy;

public class Main {

	public static void main(String[] args) {
		ManagerSpital m1= ManagerSpital.getInstance();
		ManagerSpital m2= ManagerSpital.getInstance();
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());

		ManagerSpitalLazy m3= ManagerSpitalLazy.getInstance("Gigel", 45, 1223);
		ManagerSpitalLazy m4= ManagerSpitalLazy.getInstance("Sorina", 50, 5489);
		
		m3.setVarsta(49);
		m4.setName("Ionel");
		
		System.out.println(m3.toString());
		System.out.println(m4.toString());
	}

}
