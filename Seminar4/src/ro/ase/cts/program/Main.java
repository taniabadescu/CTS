package ro.ase.cts.program;

import ro.ase.cts.clase.Fotbalist;
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
		
		
		Fotbalist f1= Fotbalist.getInstance("Marian", 21, (float)1.8);
		Fotbalist f2= Fotbalist.getInstance("Tom", 20, (float)1.81);
		
		f1.setVarsta(22);
		f2.setInaltime((float)1.78);
		 
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		
	}

}
