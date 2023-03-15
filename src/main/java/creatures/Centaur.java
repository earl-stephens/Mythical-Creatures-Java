package creatures;

public class Centaur {
	public String name;
	public String breed;
	public int cranky = 0;
	public boolean standing = true;
	
	public Centaur(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	public String shoot() {
		if(cranky == 3) {
			return "NO!";
		} else {
			cranky++;
			return "Twang!!!";
		}
	}
	
	public String run() {
		cranky++;
		return "Clop clop clop clop!";
	}
	
	public boolean isCranky() {
		if(cranky == 3) {
			return true;
		} else return false;
	}
	
	public boolean isStanding() {
		return standing;
	}
	
	public String sleep() {
		if(isStanding()) {
			return "NO!";
		} else {
			return "Good night";
		}
	}
	
	public boolean isLaying() {
		return !standing;
	}
	
	public void layDown() {
		standing = false;
	}
}
