package task1;

import java.util.*;

public class Team {
	private String name;
	private List<player> playerList;
	
	public void	addPlayerToTeam(player player1) {
		this.playerList.add(player1);
	}
	public Boolean removePlayerFromTeam(String name) {
		for (player player : playerList) {
            if (player.getName().equals(name)) {
                playerList.remove(player);
                System.out.println("Player successfully deleted");
                return true;
                }
            }
		 return false;
	}
	public void	displayPlayers() {
		for(player player:this.playerList)
		{
			System.out.println(player);
		}
	}
	
	
	@Override
	public String toString() {
		return "Team [name=" + name + ", playerList=" + playerList + "]";
	}
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Team(String name, List<player> playerList) {
		super();
		this.name = name;
		this.playerList = playerList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<player> getPlayerList() {
		return playerList;
	}
	public void setPlayerList(List<player> playerList) {
		this.playerList = playerList;
	}
	
	
}
