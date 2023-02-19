package task1;
import java.time.*;

public class player {
	private String name;
	private LocalDate DateOfBirth;
	private String Skill;
	private int NumberOfMatch;
	private int runs;
	private int wicket;
	private String Nationality;
	private Double powerRating;
	
	public player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public player(String name, LocalDate dateOfBirth, String skill, int numberOfMatch, int runs, int wicket,
			String nationality, Double powerRating) {
		super();
		this.name = name;
		DateOfBirth = dateOfBirth;
		Skill = skill;
		NumberOfMatch = numberOfMatch;
		this.runs = runs;
		this.wicket = wicket;
		Nationality = nationality;
		this.powerRating = powerRating;
	}

	public static player createPlayer(String detail) {
		 String[] details = detail.split(",");
	        player player = new player();
	        player.setName(details[0]);
	        player.setDateOfBirth(LocalDate.parse(details[1]));
	        player.setSkill(details[2]);
	        player.setNumberOfMatch(Integer.parseInt(details[3]));
	        player.setRuns(Integer.parseInt(details[4]));
	        player.setWicket(Integer.parseInt(details[5]));
	        player.setNationality(details[6]);
	        player.setPowerRating(Double.parseDouble(details[7]));
	        return player;
	}
	
	
	@Override
	public String toString() {
		return "player [name=" + name + ", DateOfBirth=" + DateOfBirth + ", Skill=" + Skill + ", NumberOfMatch="
				+ NumberOfMatch + ", runs=" + runs + ", wicket=" + wicket + ", Nationality=" + Nationality
				+ ", powerRating=" + powerRating + "]";
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	
	public String getSkill() {
		return Skill;
	}
	public void setSkill(String skill) {
		Skill = skill;
	}
	
	public int getNumberOfMatch() {
		return NumberOfMatch;
	}
	public void setNumberOfMatch(int numberOfMatch) {
		NumberOfMatch = numberOfMatch;
	}
	
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	public int getWicket() {
		return wicket;
	}
	public void setWicket(int wicket) {
		this.wicket = wicket;
	}
	
	public String getNationality() {
		return Nationality;
	}
	public void setNationality(String nationality) {
		Nationality = nationality;
	}
	
	public Double getPowerRating() {
		return powerRating;
	}
	public void setPowerRating(Double powerRating) {
		this.powerRating = powerRating;
	}
	
	
	
	
}
