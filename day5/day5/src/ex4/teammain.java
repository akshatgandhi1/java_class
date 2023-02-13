package ex4;

import java.util.*;

public class teammain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String te[] = { "Chennai Super Kings", "Sun Risers", "Delhi Daredevils", "Kings XI Punjab",
				"Kolkata Knight Riders", "Mumbai Indians", "Rajasthan Royals", "Royal Challengers Bangalore" };
				
int flagw = 0, flagr = 0;
		
		
		try {
			System.out.println("Enter the expected winner team of IPL Season 10");
			String winner = sc.nextLine();
			System.out.println("Enter the expected runner team of IPL Season 10");
			String runner = sc.nextLine();
			for(String team:te) {
				if(winner.equals(team)) {
					flagw = 1;
					break;
				}
				
			}
			
						
			for(String team:te) {
				if(runner.equals(team)) {
					flagr = 1;
					break;
				}
				
			}
			
			if(flagw == 0 || flagr == 0) {
				throw new team();
			}
			
			System.out.println("Expected IPL Season 10 winner: " + winner);
			System.out.println("Expected IPL Season 10 runner: " + runner);
			
		}catch(Exception e) {
			System.out.println(e);
	}
}
}
