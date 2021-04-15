package ro.ase.cts.program;

import ro.ase.cts.clase.ComponentaMeniu;
import ro.ase.cts.clase.Item;
import ro.ase.cts.clase.Sectiune;

public class Main {

	public static void main(String[] args) {
		
		
		ComponentaMeniu meniu= new Sectiune("Meniu");
		
		ComponentaMeniu sectiuneBauturi = new Sectiune("Bauturi");
		ComponentaMeniu sectiuneDesert = new Sectiune("Desert");
		
		ComponentaMeniu frappe = new Item("Frappe");
		ComponentaMeniu clatite = new Item("Clatite");
		ComponentaMeniu cola= new Item("Cola");
		
		meniu.adaugaNod(sectiuneDesert);
		meniu.adaugaNod(sectiuneBauturi);
		
		
		sectiuneBauturi.adaugaNod(frappe);
		sectiuneBauturi.adaugaNod(cola);
		
		sectiuneDesert.adaugaNod(clatite);
		
		meniu.afiseazaInformatii();
		
       System.out.println("-----------------------------");
		
		sectiuneBauturi.stergeNod(frappe);
		sectiuneDesert.adaugaNod(frappe);
		
		meniu.afiseazaInformatii();
		
		
		
	}

}
