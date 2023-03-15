package creatures;

public class Centaur {
	public String name;
	public String breed;
	public boolean isCranky = false;
	public boolean isStanding = true;
	
	public Centaur(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	public String shoot() {
		return "Twang!!!";
	}
	
	public String run() {
		return "Clop clop clop clop!";
	}
	
	
}
