package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.Subiect;

public class Main {

	public static void main(String[] args) {
		ManagerSala manager = new ManagerSala();
		Client client1 = new Client("Popescu");
		Client client2 = new Client("Ionescu");
		Client client3 = new Client("Georgescu");
		
		manager.adaugaObserver(client3);
		manager.adaugaObserver(client2);
		manager.adaugaObserver(client1);
		
		manager.anuntaMeciFotbal();
		
		manager.stergeObserver(client2);
		manager.anuntaMeciFotbal();
		
	}

}
