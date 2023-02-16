package task3;
import java.util.*;


public class Teammain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Team> teams=new ArrayList<Team>();
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			sc.nextLine();
			for(int i=0;i<=n;i++)
			{	
				String team=sc.nextLine();
				String teamName=team.split("\\|")[0];
				String playerName=team.split("\\|")[1];
				Playername Playername=new Playername(playerName);
				teams.add(new Team(teamName,Playername));
			}
			
			Collections.sort(teams);
			
			for(int i=0;i<teams.size();i++) {
				ArrayList<Playername> sameTeamPlayers=new ArrayList<Playername>();
				String currentTeamName=teams.get(i).getName();
				System.out.println(currentTeamName);
				for(int j=0;j<teams.size();j++)
				{
					String teamName=teams.get(j).getName();
					String playerName=teams.get(j).getPlayer().getName();
					if(teamName.equals(currentTeamName))
					{
						sameTeamPlayers.add(new Playername(playerName));
						i++;
					}
					
				}
				
				Collections.sort(sameTeamPlayers);
				for(Playername player:sameTeamPlayers) {
					System.out.println("    --"+player.getName());
				}
			}
	}

}
