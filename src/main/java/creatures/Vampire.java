package creatures;

public class Vampire {
	private String name;
	private String pet = "bat";
	
	public Vampire(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPet() {
		return pet;
	}
}
