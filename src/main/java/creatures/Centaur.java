package creatures;

public class Centaur {
	public String name;
	public String breed;
	
	public Centaur(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	public String shoot() {
		return "Twang!!!";
	}
}
