package ro.ase.cts.flyweightfactory.clase;

public class Rezervare{

	private int numarMasa;
	private int numarPersoane;
	private int oraRezervare;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [numarMasa=");
		builder.append(numarMasa);
		builder.append(", numarPersoane=");
		builder.append(numarPersoane);
		builder.append(", oraRezervare=");
		builder.append(oraRezervare);
		builder.append("]");
		return builder.toString();
	}
	public Rezervare(int numarMasa, int numarPersoane, int oraRezervare) {
		super();
		this.numarMasa = numarMasa;
		this.numarPersoane = numarPersoane;
		this.oraRezervare = oraRezervare;
	}
	
	
}

