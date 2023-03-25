package creatures;

public class Ogre {
	private String name;
	private String home = "Swamp";
	
	public Ogre(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getHome() {
		return home;
	}
}
