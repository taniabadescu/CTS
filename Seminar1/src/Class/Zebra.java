package Class;

public class Zebra extends Animal {
private int nrDungi;
	
	public Zebra(String name)
	{
		super(name);
		this.nrDungi=50;
	}

	public Zebra(String name, int nrDungi) {
		super(name);
		this.nrDungi = nrDungi;
	}

}
