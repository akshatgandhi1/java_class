package task2;
import java.time.*;
import java.lang.*;
public class Match implements Comparable<Match>{
	public Match() {
		super();
		
	}
	public Match(LocalDate matchdate, String teamone, String teamtwo) {
		super();
		this.matchdate = matchdate;
		this.teamone = teamone;
		this.teamtwo = teamtwo;
	}
	LocalDate matchdate;
	String teamone;
	String teamtwo;
	
	public LocalDate getMatchdate() {
		return matchdate;
	}
	public void setMatchdate(LocalDate matchdate) {
		this.matchdate = matchdate;
	}
	
	public String getTeamone() {
		return teamone;
	}
	public void setTeamone(String teamone) {
		this.teamone = teamone;
	}
	
	public String getTeamtwo() {
		return teamtwo;
	}
	public void setTeamtwo(String teamtwo) {
		this.teamtwo = teamtwo;
	}
	
	public int compareTo(Match o) {
		 return (o.getMatchdate()).compareTo(matchdate);
	
	}
	@Override
	public String toString() {
		return "Match [matchdate=" + matchdate + ", teamone=" + teamone + ", teamtwo=" + teamtwo + "]";
	}
	
}
