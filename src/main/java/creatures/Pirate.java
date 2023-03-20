package creatures;

public class Pirate {
	private String name;
	private String job = "Scallywag";
	
	public Pirate(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getJob() {
		return job;
	}
}
