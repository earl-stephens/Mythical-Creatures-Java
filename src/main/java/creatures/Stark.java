package creatures;

public class Stark {
	private String location = "Winterfell";
	private String name;
	
	public Stark(String name) {
		this.name = name;
	}
	
	public Stark(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getFirstName() {
		return name;
	}
}
