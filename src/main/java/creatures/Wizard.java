package creatures;

public class Wizard {
	private String name;
	private boolean bearded = true;
	private int rested = 0;
	
	public Wizard(String name) {
		this.name = name;
	}
	
	public Wizard(String name, boolean bearded) {
		this.name = name;
		this.bearded = bearded;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isBearded() {
		return bearded;
	}
	
	public String incantation(String incantation) {
		return "sudo " + incantation;
	}
	
	public boolean isRested() {
		return rested < 3;
	}
	
	public String cast() {
		rested++;
		return "MAGIC MISSILE!";
	}
}
