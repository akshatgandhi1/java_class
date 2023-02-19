package task5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of players");
		Scanner sc = new Scanner(System.in);
		int numberOfPlayers = sc.nextInt();
		sc.nextLine();
		ArrayList<player> players = new ArrayList<player>();
		for (int i = 1; i <= numberOfPlayers; i++) {

			String details = sc.nextLine();
			players.add(player.createPlayer(details));
		}
		
		String highestPlayerFromCountries=player.highestCount(players);
		System.out.println("The nationality with maximum players: "+highestPlayerFromCountries);
	}

}
