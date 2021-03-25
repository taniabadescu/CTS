package ro.ase.cts.factorymethod.clase;

public class PortarFactory implements JucatorFactory{

	@Override
	public Jucator createJucator(String nume) {
		return new Portar(nume);
	}
	

}
