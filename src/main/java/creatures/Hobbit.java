package creatures;

public class Hobbit {
	private String name;
	private String disposition = "homebody";
	private int age = 0;
	
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
	
	public int getAge() {
		return age;
	}
	
	public void celebrateBirthday() {
		age++;
	}
	
	public boolean isAnAdult() {
		return age >= 33;
	}
}
