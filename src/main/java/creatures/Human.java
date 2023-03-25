package creatures;

public class Human {
	private String name = "Jane";
	private int encounterCounter = 0;
	
	public String getName() {
		return name;
	}
	
	public void setEncounterCounter() {
		encounterCounter++;
	}
	
	public int getEncounterCounter() {
		return encounterCounter;
	}
	
	public boolean noticesOgre() {
		return encounterCounter == 3;
	}
}
