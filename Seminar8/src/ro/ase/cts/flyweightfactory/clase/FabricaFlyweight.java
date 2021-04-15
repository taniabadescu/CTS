package ro.ase.cts.flyweightfactory.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaFlyweight {
	
	private Map<String, FlyWeightAbstract> clienti;
	
	public FabricaFlyweight()
	{
		clienti = new HashMap<>();
	}
	
	public FlyWeightAbstract getClient(String numarTelefon)
	{
		Client client = (Client) clienti.get(numarTelefon);
		if(client ==null)
		{
			client = new Client("Popescu",numarTelefon, "popescu@gmail.com");
		    clienti.put(numarTelefon, client);
		}
		return client;
	}
	
	
}
