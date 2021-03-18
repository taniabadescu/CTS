package ro.ase.cts.clase;

public class Fotbalist {
	private String name;
	private int varsta;
	private float inaltime;
	
    private static Fotbalist instanta = null;
	
	public static synchronized Fotbalist getInstance(String name, int varsta, float inaltime) 
	{
		if(instanta==null)
		{
			instanta = new Fotbalist(name, varsta, inaltime);
		}
		return instanta;
	}
	
	private Fotbalist(String name, int varsta, float inaltime) {
		super();
		this.name = name;
		this.varsta = varsta;
		this.inaltime = inaltime;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	

	public void setInaltime(float inaltime) {
		this.inaltime = inaltime;
	}

	@Override
	public String toString() {
		return "Fotbalist [name=" + name + ", varsta=" + varsta + ", inaltime=" + inaltime + "]";
	}
	
	

}
