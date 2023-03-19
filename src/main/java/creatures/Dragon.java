package creatures;

public class Dragon {
	private String name;
	private String rider;
	private String color;
	private boolean hungry = true;
	private int hungerCounter = 0;
	
	public Dragon(String name, String color, String rider) {
		this.name = name;
		this.rider = rider;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	
	public String getRider() {
		return rider;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean isHungry() {
		return hungry;
	}
	
	public void eat() {
		hungerCounter++;
		if(hungerCounter == 3) hungry = false;
	}
}
