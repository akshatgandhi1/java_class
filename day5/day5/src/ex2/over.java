package ex2;

import java.util.Scanner;

public class over {
	public static void main(String args[]) {
		System.out.println("enter number of overs");
		Scanner sc=new Scanner(System.in);
		try {
			int a=sc.nextInt();
			
			int[] n=new int[a];
		System.out.println("enter the runs of per over");
		
		for (int i=0;i<a;i++) {
			n[i]=sc.nextInt();	
		}
		
			System.out.println("enter the over number");
			int b=sc.nextInt();
			
			System.out.println("Runs scored in this over: "+n[b]);
			
			
		}
		catch(Exception e) {
			System.out.println(e.getClass().getName());
		}
	}
}
