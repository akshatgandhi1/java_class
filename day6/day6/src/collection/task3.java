package collection;
import java.util.*;

public class task3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> player=new ArrayList<String>();
		ArrayList<String> player1=new ArrayList<String>();
		
		System.out.println("Enter the top 5 scorers of IPL Season 14");
		for(int i=0;i<5;i++) {
			String playername1=sc.nextLine();
			player.add(playername1);
		}
		System.out.println("Enter the top 5 scorers of IPL Season 15");
		for(int i=0;i<5;i++) {
			String playername2=sc.nextLine();
			player1.add(playername2);
		}
		player.retainAll(player1);
		System.out.println("Consistent Scorer: "+player);
		
	}
}

