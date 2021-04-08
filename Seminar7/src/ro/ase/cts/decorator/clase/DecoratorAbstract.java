package ro.ase.cts.decorator.clase;

public abstract class DecoratorAbstract implements BiletAbstract{
	private BiletAbstract biletAbstract;

	public DecoratorAbstract(BiletAbstract biletAbstract) {
		super();
		this.biletAbstract = biletAbstract;
	}

	@Override
	public void rezervaBilet() {
		biletAbstract.rezervaBilet();
		
	}

	public BiletAbstract getBiletAbstract() {
		return biletAbstract;
	}
	

}
