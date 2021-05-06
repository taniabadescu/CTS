package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandaConstituire;
import ro.ase.cts.command.clase.ComandaDepunere;
import ro.ase.cts.command.clase.CommandRetragere;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		ContBancar cont = new ContBancar("Gigel");
		ManagerComenzi manager = new ManagerComenzi();
		manager.invoca(new ComandaConstituire(cont, 50));
		manager.invoca(new ComandaDepunere(cont, 30));

		manager.executaComanda();
		
		manager.invoca(new CommandRetragere(cont, 20));
		manager.executaComanda();
		manager.executaComanda();
	}

}
