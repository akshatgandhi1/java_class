package task1;
import java.time.*;
import java.time.temporal.Temporal;
import java.util.*;

public class ex1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		LocalTime dur1=LocalTime.now();
		System.out.println("entry entry hour");
		int in_hours=sc.nextInt();
		int in_min=0;
		LocalTime dur2=null;
		Duration d=null;
		if(dur1.getHour()>in_hours) {
			in_min=sc.nextInt();
		}
		else if(in_hours>24){
			System.out.println("invalid time");
		}
		else {
			System.out.println("invalid time");
		}
		d=Duration.between(dur2,dur1);
		System.out.println(d);
		
	}
}
