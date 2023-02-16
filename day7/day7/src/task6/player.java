package task6;

public class player {
	String bowlerName;
	int wicketCount;
	
	
	public player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public player(String bowlerName, int wicketCount) {
		super();
		this.bowlerName = bowlerName;
		this.wicketCount = wicketCount;
	}
	public String getBowlerName() {
		return bowlerName;
	}
	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}
	public int getWicketCount() {
		return wicketCount;
	}
	public void setWicketCount(int wicketCount) {
		this.wicketCount = wicketCount;
	} 
}
