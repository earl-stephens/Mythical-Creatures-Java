package creatures;

import java.util.ArrayList;
import java.util.List;

public class Medusa {
	private String name;
	private List<Person> statues = new ArrayList<>();	
	
	public Medusa(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int statuesGetCount() {
		return statues.size();
	}
	
	public void stare(Person victim) {
		victim.setStoned(true);
		if(statues.size() < 3) {
			statues.add(victim);
		} else {
			statues.get(0).setStoned(false);
			statues.remove(0);
			statues.add(victim);
		}
	}
	
	public Person getVictim(int index) {
		return statues.get(index);
	}
}
