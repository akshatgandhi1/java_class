package task3;

public class Team implements Comparable<Team> {
	private String name;
	private Playername Playername;
	
	
	public Team()
	{
		
	}
	public Team(String name, Playername playername) {
		super();
		this.name = name;
		this.Playername = playername;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Playername getPlayer() {
		return Playername;
	}


	public void setPlayer(Playername playername) {
		this.Playername = playername;
	}




	@Override
	public String toString() {
		return "name=" + name + ", player=" + Playername ;
	}


	@Override
	public int compareTo(Team team) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(team.getName());
	}

}