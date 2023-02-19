package task1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.time.*;

public class main {
	public static void main(String arg[]) throws IOException {
		Scanner sc=new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = reader.readLine();
		Team team=new Team("name",new ArrayList<player>());
		
		while(true) {
			 System.out.println("\nChoose an option:");
	            System.out.println("1. Add player");
	            System.out.println("2. Remove player");
	            System.out.println("3. Display players");
	            System.out.println("4. Exit");
	            
	            int option=sc.nextInt();
	            
	            switch(option) {
	            case 1: // add player
					System.out.println("Enter the details of player in CSV format:\n");
					System.out.format("%-15s %-15s %-15s %-20s %-15s %-15s %-15s %s\n","Name","Date of Birth","Skill","Number of Matcbes","Runs","Wickets","Nationality","Power Rating");

					String details = reader.readLine();
					team.addPlayerToTeam(player.createPlayer(details));
					break;
				case 2: // delete player
					System.out.println("Enter the name of the player to be deleted:");
					boolean result = team.removePlayerFromTeam(reader.readLine());
					if (result)
						System.out.println("Player successfully deleted");
					else
						System.out.println("Player not found");
					break;
				case 3:
					System.out.format("%-15s %-15s %-15s %-20s %-15s %-15s %-15s %s\n","Name","Date of Birth","Skill","Number of Matcbes","Runs","Wickets","Nationality","Power Rating");
					for (player player : team.getPlayerList())
						System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", player.getName(),player.getDateOfBirth().toString(),player.getSkill(),player.getNumberOfMatch(),player.getRuns(),player.getWicket(),player.getNationality(),player.getPowerRating()); 
					break;
				case 4:
					System.exit(0);
                    break;
				default:
					System.out.println("Invalid choice");
					break;
	            
	            }
		}
	}
}
