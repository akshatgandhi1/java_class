package task5;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Please provide the number of players to be registered");
			Scanner sc=new Scanner(System.in);
			int numberOfPlayers=sc.nextInt();
			String skills[]= {"All Rounder","Batsman","Bowler"};
			sc.nextLine();
			
			ArrayList<player> players=new ArrayList<player>();
			
			for(int i=1;i<=numberOfPlayers;i++)
			{
				System.out.println("Please enter player name");
				String name=sc.nextLine();
				System.out.println("Please select the skill of the player \n1.All Rounder\n2.Batsman\n3.Bowler");
				int choice=sc.nextInt();
				sc.nextLine();
				players.add(new player(name,skills[choice-1]));
			}
			player1 playerComparator=new player1();
			Collections.sort(players,playerComparator);
			
			System.out.println("Player Details");
			for(player player:players)
				System.out.println("Player: "+player.getName()+":"+player.getSkill());
			
		

	}
}
	
	