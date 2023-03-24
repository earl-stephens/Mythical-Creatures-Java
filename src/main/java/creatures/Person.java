package creatures;

public class Person {
	private String name;
	private boolean stoned = false;
	private boolean dead = false;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isStoned() {
		return stoned;
	}
	
	public void setStoned(boolean staredAt) {
		stoned = staredAt;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}
	
	public boolean isDead() {
		return dead;
	}
}
