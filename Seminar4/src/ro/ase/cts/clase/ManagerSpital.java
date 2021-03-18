package ro.ase.cts.clase;

public class ManagerSpital {
	private String name;
	private int varsta;
	private int marca;
	
	private static ManagerSpital manager = new ManagerSpital("m1",46, 5473);
	
	public static ManagerSpital getInstance()
	{
		return manager;
	}
	
	private ManagerSpital(String name, int varsta, int marca) {
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
