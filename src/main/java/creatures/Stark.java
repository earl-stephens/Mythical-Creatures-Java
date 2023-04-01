package creatures;

public class Stark {
	private String location = "Winterfell";
	private String name;
	private boolean isSafe = false;
	private String houseWords = "Winter is Coming";
	
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
	
	public boolean isSafe() {
		return isSafe;
	}
	
	public String getHouseWords() {
		return houseWords;
	}
	
	public void setSafe(boolean safe) {
		isSafe = safe;
	}
}
