package exa1;
import java.util.*;


public class inningsmain {
	public static void main(String[] args) {
		System.out.println("enter team name");
		Scanner sc=new Scanner(System.in);
		innings enc=new innings();
		
		String b=sc.nextLine();
		enc.setTeamname(b);
		
		
		System.out.println("enter team innings");
		String a=sc.nextLine();
		enc.setInningsname(a);
		
		System.out.println("enter team runs");
		int c=sc.nextInt();
		enc.setRuns(c);
		
		
		String d=new String("second");
		String e=enc.getInningsname().toLowerCase();
		
		
		if(e.equals(d)) {
			enc.displayInningsDetails();
			System.out.println("match over");
		}
		else {
			enc.displayInningsDetails();
			System.out.println("runs need to win: "+(enc.getRuns()+1));
			
		}
	}
}
