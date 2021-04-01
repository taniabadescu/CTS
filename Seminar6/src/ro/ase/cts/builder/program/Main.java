package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.BuilderAbstract;
import ro.ase.cts.builder.clase.BuilderRezervareV2;
import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;

public class Main {

	public static void main(String[] args) {
		RezervareBuilder rezervareBuilder = new RezervareBuilder();
		Rezervare rezervare1 = rezervareBuilder.setAreBauturaInclusa(true).build();
		Rezervare rezervare2 = rezervareBuilder.setGenMuzical("rock").build();
	
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
		
		BuilderRezervareV2 builder2 = new BuilderRezervareV2();
		Rezervare rezervare3 = builder2.setAreBauturaInclusa(true).build();
		Rezervare rezervare4 = builder2.setAreBauturaInclusa(true).setAreMuzicaAmbientala(true).setGenMuzical("rock").build();
		
		System.out.println(rezervare3.toString());
		System.out.println(rezervare4.toString());
		
	}

}
