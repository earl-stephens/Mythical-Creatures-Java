package creatures;

public class Direwolf {
	private String name;
	private String home = "Beyond the Wall";
	
	public Direwolf(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getHome() {
		return home;
	}
}
