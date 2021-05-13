package ro.ase.cts.template.clase;

public class SpectatorCuHandicap extends TemplateIntrareStadion{
	private String nume;

	public SpectatorCuHandicap(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		System.out.println(nume+" a fost preluat de la coada");
	}

	@Override
	public void prezentareBilet() {
		System.out.println(nume+" a prezentat biletul");
	}

	@Override
	public void ControlCorporal() {
		System.out.println(nume+" a fost controlat. Caruciorul a fost controlat");
	}

	@Override
	public void ocupareLoc() {
		System.out.println(nume+" a ocupat locul special");
	}
	
	

}
