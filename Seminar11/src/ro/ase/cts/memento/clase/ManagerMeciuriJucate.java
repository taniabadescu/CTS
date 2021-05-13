package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMeciuriJucate {
	
	List<Memento> backupuri;
	
	
	public ManagerMeciuriJucate() {
		super();
		this.backupuri = new ArrayList<>();
	}

	public void adaugaMemento(Memento memento)
	{
		backupuri.add(memento);
	}
	
	public Memento getMemento(int pozitieMemento) {
		if(pozitieMemento < backupuri.size())
			return backupuri.get(pozitieMemento);
		else
		{
			throw new IndexOutOfBoundsException();
		}
	}

}
