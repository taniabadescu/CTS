package ro.ase.cts.strategy.clase;

public class Client {
	
	private String nume;
	private ModaliattePlata modalitatePlata;
	
	
	
	public Client(String nume, ModaliattePlata modalitatePlata) {
		super();
		this.nume = nume;
		this.modalitatePlata = modalitatePlata;
	}



	public void setModalitatePlata(ModaliattePlata modalitatePlata) {
		this.modalitatePlata = modalitatePlata;
	}
	
	
	public void platesteNota(float suma)
	{
		System.out.println(this.nume+" are de platit nota in valoare de "+suma+" lei");
		modalitatePlata.achita(suma);
	}

}
