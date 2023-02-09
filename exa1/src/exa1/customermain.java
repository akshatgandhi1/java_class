package exa1;
import java.util.*;

public class customermain {
	public static void main(String[] args) {
		System.out.print("enter the customer detail \n");
		Scanner sc=new Scanner(System.in);
		customer en=new customer();
		String[] a=sc.nextLine().split(",");
		en.setName(a[0]);
		en.setAddress(a[1]);
		en.setMobile(a[2]);
		
		 System.out.println("Customer details: ");
         System.out.println("Name: "+en.getName());
         System.out.println("Address: "+en.getAddress());
         System.out.println("Mobile: "+en.getMobile());
	
		
	}
}
