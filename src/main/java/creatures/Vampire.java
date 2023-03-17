package creatures;

public class Vampire {
	private String name;
	private String pet = "bat";
	
	public Vampire(String name) {
		this.name = name;
	}
	
	public Vampire(String name, String pet) {
		this.name = name;
		this.pet = pet;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPet() {
		return pet;
	}
}
