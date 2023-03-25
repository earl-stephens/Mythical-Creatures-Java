package creatures;

public class Ogre {
	private String name;
	private String home = "Swamp";
	private int swings = 0;
	
	public Ogre(String name) {
		this.name = name;
	}
	
	public Ogre(String name, String home) {
		this.name = name;
		this.home = home;
	}
	
	public String getName() {
		return name;
	}
	
	public String getHome() {
		return home;
	}
	
	public void encounter(Human human) {
		human.setEncounterCounter();
		if(human.getEncounterCounter() == 3) swingAt(human);
	}
	
	public int getSwings() {
		return swings;
	}
	
	public void swingAt(Human human) {
		swings++;
	}
}
