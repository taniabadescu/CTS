package ro.ase.cts.flyweightfactory.clase;

public class Client implements FlyWeightAbstract{

	private String numeClient;
	private String nrTelefon;
	private String adresaEmail;
	
	
	@Override
	public void afiseazaInformatii(Rezervare rezervare) {
	System.out.println(this.toString()+rezervare.toString());	
	}
	
	
	
	
	public Client(String numeClient, String nrTelefon, String adresaEmail) {
		super();
		this.numeClient = numeClient;
		this.nrTelefon = nrTelefon;
		this.adresaEmail = adresaEmail;
	}




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [numeClient=");
		builder.append(numeClient);
		builder.append(", nrTelefon=");
		builder.append(nrTelefon);
		builder.append(", adresaEmail=");
		builder.append(adresaEmail);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
