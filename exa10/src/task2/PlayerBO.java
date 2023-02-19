package task2;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


public class PlayerBO  {
	
	public List<player> findPlayer(List<player> playerList, String nationality) 
	{
		return playerList.stream().filter(player->player.getNationality().equals(nationality)).collect(Collectors.toList());
	}
	public List<player> findPlayer(List<player> playerList, LocalDate dateOfBirth) 
	{
		return playerList.stream().filter(player->player.getDateOfBirth().equals(dateOfBirth)).collect(Collectors.toList());
	}
	public List<player> findPlayer( List<player> playerList,Double powerRating) 
	{
		return playerList.stream().filter(player->player.getPowerRating()==(powerRating)).collect(Collectors.toList());
	}
}
