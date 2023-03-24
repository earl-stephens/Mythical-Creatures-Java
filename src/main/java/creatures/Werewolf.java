package creatures;

public class Werewolf {
	private String name;
	private String location;
	private boolean human = true;
	
	public Werewolf(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public boolean isHuman() {
		return human;
	}
}
