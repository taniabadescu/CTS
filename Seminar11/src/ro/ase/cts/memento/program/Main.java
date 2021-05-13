package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMeciuriJucate;
import ro.ase.cts.memento.clase.MeciJucat;

public class Main {

	public static void main(String[] args) {
		MeciJucat meciJucat = new MeciJucat("Steaua", "Dinamo", 500, 500, 1000, 100);
	    ManagerMeciuriJucate managerMeciuriJucate = new ManagerMeciuriJucate();
	    managerMeciuriJucate.adaugaMemento(meciJucat.salvareInformatii());
	    
	    meciJucat.setNrSpectatori(300);
	    meciJucat.setEchipaGazda("Ghiajna");
	    meciJucat.setEchipaOaspete("Chindia");
	    managerMeciuriJucate.adaugaMemento(meciJucat.salvareInformatii());
	
	    System.out.println(meciJucat.toString());
	    
	    meciJucat.revenire(managerMeciuriJucate.getMemento(0));
	    
	    System.out.println(meciJucat.toString());
	    
	    
	}

}
