package ex1;

import java.util.*;

public class runrate {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the score");
		int a=sc.nextInt();
		System.out.println("enter the over");
		int b=sc.nextInt();
		try {
			int Runrate=a/b;
			System.out.println("the runrate is: "+Runrate);
		}
		catch(Exception e){
		System.out.println(e.getClass().getName());
		}
	}
}
