package ro.ase.cts.adapter.clase;

public class Adapter extends Bilet implements BiletOnline{

	public Adapter(float pret) {
		super(pret);
	}

	@Override
	public void vindeBilet() {
		super.vinde();
	}

	@Override
	public void rezervaBilet() {
		super.rezerva();
	}
	
}
