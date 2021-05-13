package ro.ase.cts.template.clase;

public abstract class TemplateIntrareStadion {

	
	public abstract void asezareCoada();
	public abstract void prezentareBilet();
	public abstract void ControlCorporal();
	public abstract void ocupareLoc();
	
	public final void intrareStadion()
	{
		asezareCoada();
		prezentareBilet();
		ControlCorporal();
		ocupareLoc();
	}
}
