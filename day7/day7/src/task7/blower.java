package task7;

public class blower {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "blower [name=" + name + "]";
	}

	public blower() {
		super();
		// TODO Auto-generated constructor stub
	}

	public blower(String name) {
		super();
		this.name = name;
	}
}
