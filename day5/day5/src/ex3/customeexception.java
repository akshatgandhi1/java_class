package ex3;
import java.util.*;

public class customeexception {
	public static void main(String args[])throws exception {
		System.out.println("enter player name");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		System.out.println("enter player age");
		int b=sc.nextInt();
		except(b);
		System.out.println("player name is: "+a);
		System.out.println("player age is: "+b);	
	
	}
	public static void except(int age) throws exception{
		if(age<19) {
			
				throw new exception("age less than 19");
			
		}
	}
}
