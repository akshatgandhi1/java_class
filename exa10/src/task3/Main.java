//using lambda fuction
package task3;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of players");
		int number=sc.nextInt();
		sc.nextLine();
		ArrayList<player> al=new ArrayList<>(); 
		for(int i=0;i<number;i++){
			String playerdetail=sc.nextLine();
			al.add(player.createPlayer(playerdetail));
		}
		
		while(true) {
			System.out.println("1.Sort by number of matches played\n");
			System.out.println("2.Sort by runs scored\n");
			System.out.println("3.Sort by power rating\n");
			System.out.println("4.exit\n");
			
			int option=sc.nextInt();
			sc.nextLine();
			
			switch(option) {
			case 1:
				Collections.sort(al,(p1,p2)->{
					if(p1.getNumberOfMatch() < p2.getNumberOfMatch()) return 1;
					if(p1.getNumberOfMatch() > p2.getNumberOfMatch()) return -1;
					return 0;
				});
				break;
			case 2:
				Collections.sort(al,(p1,p2)->{
					if(p1.getRuns() < p2.getRuns()) return 1;
					if(p1.getRuns() > p2.getRuns()) return -1;
					return 0;
				});
				break;
			case 3:
				Collections.sort(al,(p1,p2)->{
					if(p1.getPowerRating() < p2.getPowerRating()) return 1;
					if(p1.getPowerRating() > p2.getPowerRating()) return -1;
					return 0;
				});
				break;
			case 4:
				System.exit(0);
                break;
                
				default:
					break;
				}
			System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", "Name","Date of birth","Skill","No of matches","Runs","Wickets","Nationality","Rating");
			for (player player : al)
				System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", player.getName(),
						player.getDateOfBirth().toString(), player.getSkill(),player.getNumberOfMatch(), player.getRuns(),
						player.getWicket(), player.getNationality(), player.getPowerRating());
		}
	}
}
