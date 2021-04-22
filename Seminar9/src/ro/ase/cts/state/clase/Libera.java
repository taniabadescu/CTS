package ro.ase.cts.state.clase;

public class Libera implements Stare{

	@Override
	public void schimbaStarea(Masa masa) {
		if(!(masa.getStare() instanceof Libera))
		{
			System.out.println("Masa cu codul "+masa.getNr()+" a fost eliberata!");
			masa.setStare(this);
		}
		else
		{
			System.out.println("Masa cu codul "+masa.getNr()+" este deja libera!");

		}
		
	}

}
