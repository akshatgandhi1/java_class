package task5;

public class player {
	private String name;
	private String skill;
	
	public player(String name, String skill) {
		super();
		this.name = name;
		this.skill = skill;
	}
	
	public player() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
}
