package ro.ase.cts.chain.clase;

public class ContEconomii extends Cont {

	public ContEconomii(String detinator, float sold) {
		super(detinator, sold);
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(suma<= super.getSold()) {
			System.out.println("S-a realizat plata! :) din CONTUL DE ECONOMII");
			super.setSold(super.getSold()-suma);
		}else {
			super.getSuccesor().realizeazaPlata(suma);
		}
	}

}
