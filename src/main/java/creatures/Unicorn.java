package creatures;

public class Unicorn {
	private String name;
	private String color = "Silver";

	public Unicorn(String name) {
		this.name = name;
	}
	
	public Unicorn(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean isSilver() {
		if(color.equals("Silver")) {
			return true;
		}
		return false;
	}
	
	public String say(String phrase) {
		StringBuilder sb = new StringBuilder();
		sb.append("**;* ");
		sb.append(phrase);
		sb.append(" **;*");
		return sb.toString();
	}
}
