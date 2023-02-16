package task2;
import java.util.*;
import java.time.*;

public class matchmain {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number of matches");
		int number=Sc.nextInt();Sc.nextLine();
		ArrayList<Match> al=new ArrayList<Match>();
		for(int i=0;i<number;i++) {
			System.out.println("Enter match date in (yyyy-MM-dd)");
			String date=Sc.nextLine();
			System.out.println("Enter Team 1");
			String teamone=Sc.nextLine();
			System.out.println("Enter Team 2");
			String teamtwo=Sc.next();
			
		    LocalDate matchdate = LocalDate.parse(date);
			Match match=new Match(matchdate,teamone,teamtwo);
			al.add(match);
		}
		Collections.sort(al);
		System.out.println(al);
		
	}
}
