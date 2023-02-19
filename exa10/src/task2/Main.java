package task2;




import java.time.*;
import java.util.*;


public class Main {

	public static void main(String[] args){
		System.out.println("Enter number of players");
		Scanner sc = new Scanner(System.in);
		int numberOfPlayers = sc.nextInt();
		sc.nextLine();
		ArrayList<player> players = new ArrayList<player>();
		
		for (int i = 1; i <= numberOfPlayers; i++) {

			String details = sc.nextLine();
			players.add(player.createPlayer(details));
		}
		List<player> requiredPlayers = new ArrayList<player>();
		

		while(true) {
			 System.out.println("\nChoose an option:");
	            System.out.println("1. By Nationality");
	            System.out.println("2. By Date of Birth");
	            System.out.println("3. By Power Rating");
		
		
		
		
		 int option=sc.nextInt();
         
		switch (option) {
		case 1:
			System.out.println("Enter the Nationality:");

			requiredPlayers = new PlayerBO().findPlayer(players, sc.nextLine());
			
			break;
		case 2:
			System.out.println("Enter the Date of Birth:");
			requiredPlayers = new PlayerBO().findPlayer(players, LocalDate.parse(sc.nextLine()));
			
			break;
		case 3:
			System.out.println("Enter the Power Rating:");
			requiredPlayers = new PlayerBO().findPlayer(players, Double.parseDouble(sc.nextLine()));
			}
			break;
		
		}
		int option=sc.nextInt();
		while(option==1 | option==2 | option==3) {
			for(player p1:requiredPlayers) {
				System.out.printf("%-15s %-15s %-15s %-20s %-15s %-15s %-15s %s\n", p1.getName(),
						p1.getDateOfBirth(), p1.getSkill(), p1.getNumberOfMatch(), p1.getRuns(),
						p1.getWicket(), p1.getNationality(), p1.getPowerRating());
			
		}
		
		}

	}

}
