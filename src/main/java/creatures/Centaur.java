package creatures;

public class Centaur {
	private String name;
	private String breed;

	private int cranky = 0;
	private boolean standing = true;
	
	public Centaur(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public String shoot() {
		if(cranky == 3 || isLaying()) {
			return "NO!";
		} else {
			cranky++;
			return "Twang!!!";
		}
	}
	
	public String run() {
		if(isLaying()) {
			return "NO!";
		} else {
			cranky++;
			return "Clop clop clop clop!";
		}
	}
	
	public boolean isCranky() {
		if(cranky == 3) return true;
		return false;
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
	
	public String drinkPotion() {
		if(!standing) {
			return "NO!";
		} else if(cranky == 0){
			return "I don't feel good!";
		} else {
			cranky = 0;
			return "This tastes good!";
		}
	}
}
