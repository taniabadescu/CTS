package Class;

public class Zookeeper {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void feed(Animal a) {
		System.out.println(name + "hraneste animal" + a.getName());
	}
}
