package collection;
import java.util.*;

public class ex1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList playerdetail=new ArrayList();
		System.out.println("enter player detail");
		System.out.println("enter player name");
		String name=sc.nextLine();
		playerdetail.add(name);
		System.out.println("enter age");
		String age=sc.nextLine();
		playerdetail.add(age);
		System.out.println("enter country");
		String country=sc.nextLine();
		playerdetail.add(country);

		for(int i=0;i<playerdetail.size();i++) {
			System.out.println(playerdetail.get(i));
		}
		System.out.println("enter skill");
		String skill=sc.nextLine();
		System.out.println("Enter the position to add the skill ");
		int index=sc.nextInt();
		playerdetail.set(index,skill);
		for(int i=0;i<playerdetail.size();i++) {
			System.out.println(playerdetail.get(i));
		}	
		
		System.out.println("enter index to remove");
		int remo=sc.nextInt();
		playerdetail.remove(remo);
		
		for(int i=0;i<playerdetail.size();i++) {
			System.out.println(playerdetail.get(i));
		}
	}
}
