package ro.ase.cts.clase;

public class ManagerSpitalLazy {
	private String name;
	private int varsta;
	private int marca;
	
	private static ManagerSpitalLazy instanta = null;
	
	public static synchronized ManagerSpitalLazy getInstance(String name, int varsta, int marca) 
	{
		if(instanta==null)
		{
			instanta = new ManagerSpitalLazy(name, varsta, marca);
		}
		return instanta;
	}
	
	private  ManagerSpitalLazy(String name, int varsta, int marca) {
		super();
		this.name = name;
		this.varsta = varsta;
		this.marca = marca;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void setMarca(int marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "ManagerSpital [name=" + name + ", varsta=" + varsta + ", marca=" + marca + "]";
	}
	
	
}
