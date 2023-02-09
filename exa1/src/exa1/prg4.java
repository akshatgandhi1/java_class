package exa1;
import java.util.*;

public class prg4 {
	public static void main(String[] args) {
		System.out.println("enter the employee name");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		prg3 enc=new prg3();
		enc.setName(a);
		
		System.out.println("enter the m.no");
		String b=sc.nextLine();
		enc.setMobile(b);
		
		System.out.println("enter the employee address");
		String c=sc.nextLine();
		enc.setAddress(c);
		
		System.out.println("The employee details");
		System.out.println("The employee name: "+enc.getName());
		
		
		System.out.println("The employee mobile: "+enc.getMobile());
		
		
		System.out.println("The employee address: "+enc.getAddress());
		
		
		
	}
}
