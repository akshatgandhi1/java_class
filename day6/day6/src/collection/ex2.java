package collection;
import java.util.*;

public class ex2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> teamname=new ArrayList<String>();
		for(int i=0;i<5;i++) {
			String playername=sc.nextLine();
			teamname.add(playername);
		}
		System.out.println("Enter swap positions");
		int position=sc.nextInt();
		Collections.swap(teamname, 0, position);
		System.out.println(teamname);
}
}
