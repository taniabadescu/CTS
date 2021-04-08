package ro.ase.cts.clase;

public class Persoana {
	private String nume;
	private String CNP;
	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setCNP(String cNP) {
		CNP = cNP;
	}
	public String getNume() {
		return nume;
	}
	public String getCNP() {
		return CNP;
	}
	public Persoana(String nume, String cNP) {
		super();
		this.nume = nume;
		CNP = cNP;
	}
	@Override
	public String toString() {
		return "Persoana [nume=" + nume + ", CNP=" + CNP + "]";
	}
	

}
