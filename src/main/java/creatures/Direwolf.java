package creatures;

import java.util.ArrayList;
import java.util.List;

public class Direwolf {
	private String name;
	private String home = "Beyond the Wall";
	private String size = "Massive";
	private int numberOfStarksToProtectAtOneTime = 2;
	public List<Stark> starksToProtect = new ArrayList<>();
	private boolean huntsWhiteWalkers = true;
	
	public Direwolf(String name) {
		this.name = name;
	}
	
	public Direwolf(String name, String home, String size) {
		this.name = name;
		this.home = home;
		this.size = size;
	}
	
	public Direwolf(String name, String home) {
		this.name = name;
		this.home = home;
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
	
	public void protects(Stark stark) {
		if(stark.getLocation().equals(home) && starksToProtect.size() < numberOfStarksToProtectAtOneTime) {
			starksToProtect.add(stark);
			stark.setSafe(true);
			huntsWhiteWalkers = false;
		}
	}
	
	public List<Stark> getProtectedStarks() {
		return starksToProtect;
	}
	
	public boolean huntsWhiteWalkers() {
		return huntsWhiteWalkers;
	}
	
	public Stark leaves(Stark stark) {
		starksToProtect.remove(stark);
		stark.setSafe(false);
		return stark;
	}
}
