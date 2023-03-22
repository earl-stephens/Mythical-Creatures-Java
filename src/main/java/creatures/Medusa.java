package creatures;

import java.util.ArrayList;
import java.util.List;

public class Medusa {
	private String name;
	private List<String> statues = new ArrayList<>();	
	
	public Medusa(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int statuesGetCount() {
		return statues.size();
	}
}
