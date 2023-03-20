package creatures;

public class Hobbit {
	private String name;
	private String disposition = "homebody";
	
	public Hobbit(String name) {
		this.name = name;
	}
	
	public Hobbit(String name, String disposition) {
		this.name = name;
		this.disposition = disposition;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDisposition() {
		return disposition;
	}
}
