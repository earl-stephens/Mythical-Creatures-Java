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
		if(cranky == 3 || isLaying() == true) {
			return "NO!";
		} else {
			cranky++;
			return "Twang!!!";
		}
	}
	
	public String run() {
		if(isLaying() == true) {
			return "NO!";
		} else {
			cranky++;
			return "Clop clop clop clop!";
		}
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
			cranky = 0;
			return "Good night";
		}
	}
	
	public boolean isLaying() {
		return !standing;
	}
	
	public void layDown() {
		standing = false;
	}
	
	public void standUp() {
		standing = true;
	}
	
	public void drinkPotion() {
		cranky = 0;
	}
}
