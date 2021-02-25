package pachet;

import Class.Giraffe;
import Class.Zebra;
import Class.Zoo;

public class Main {

	public static void main(String[] args) {
     Zoo zoo = new Zoo();
     
     Giraffe g1= new Giraffe("Maia",300);
     Giraffe g2 = new Giraffe("Lola");
     
     
     Zebra z1= new Zebra("Titi",80);
     Zebra z2 = new Zebra("Lila");
     
     zoo.addAnimal(g1);
     zoo.addAnimal(g2);
     zoo.addAnimal(z1);
     zoo.addAnimal(z2);
     zoo.feedAllAnimals();

	}

}
