package creatures;

public class Werewolf {
	private String name;
	private String location;
	private boolean human = true;
	private boolean hungry = false;
	
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
	
	public void change() {
		if(human) {
			hungry = true;
			human = false;
		} else human = true;
	}
	
	public boolean isWolf() {
		return !human;
	}
	
	public boolean isHungry() {
		return hungry;
	}
}
