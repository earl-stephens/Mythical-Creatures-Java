package creatures;

public class Pirate {
	private String name;
	private String job = "Scallywag";
	private int cursedCounter = 0;
	
	public Pirate(String name) {
		this.name = name;
	}
	
	public Pirate(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String getName() {
		return name;
	}
	
	public String getJob() {
		return job;
	}
	
	public void commitHeinousAct() {
		cursedCounter++;
	}
	
	public boolean isCursed() {
		return cursedCounter >= 3;
	}
}
