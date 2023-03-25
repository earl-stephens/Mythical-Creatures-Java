package creatures;

public class Ogre {
	private String name;
	private String home = "Swamp";
	
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
	}
}
