package ro.ase.cts.strategy.clase;

public class Cash implements ModaliattePlata{

	
	@Override
	public void achita(float suma) {
		System.out.println("S-a realizat plata Cash pentru suma "+suma+" lei");

	}

}
