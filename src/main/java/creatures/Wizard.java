package creatures;

public class Wizard {
	private String name;
	private boolean bearded = true;
	
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
}
