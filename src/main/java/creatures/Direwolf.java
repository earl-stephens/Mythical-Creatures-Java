package creatures;

public class Direwolf {
	private String name;
	private String home = "Beyond the Wall";
	private String size = "Massive";
	
	public Direwolf(String name) {
		this.name = name;
	}
	
	public Direwolf(String name, String home, String size) {
		this.name = name;
		this.home = home;
		this.size = size;
	}
	
	public String getName() {
		return name;
	}
	
	public String getHome() {
		return home;
	}
	
	public String getSize() {
		return size;
	}
}
