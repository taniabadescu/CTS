package ro.ase.cts.clase;

public interface ComponentaMeniu {

	void adaugaNod(ComponentaMeniu componenta);
	void stergeNod(ComponentaMeniu componenta);
	void afiseazaInformatii();
	ComponentaMeniu getComponenta(int index) throws Exception;
	
}
