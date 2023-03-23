package creatures;

public class Person {
	private String name;
	private boolean stoned = false;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isStoned() {
		return stoned;
	}
	
	public void setStoned(boolean staredAt) {
		stoned = staredAt;
	}
}
