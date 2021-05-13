package ro.ase.cts.template.clase;

public class SpectatorUzual extends TemplateIntrareStadion{

	
	private String nume;
	
	
	public SpectatorUzual(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		System.out.println(nume+" s-a asezat la coada");
	}

	@Override
	public void prezentareBilet() {
		System.out.println(nume+" a prezentat bilet");
	}

	@Override
	public void ControlCorporal() {
		System.out.println(nume+" a fost controlat");
	}

	@Override
	public void ocupareLoc() {
		System.out.println(nume+" a ocupat locul");
	}

}
