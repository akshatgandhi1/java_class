package traninig;
import java.util.*;

public class example3 {
	public static void main(String args[]) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n<0) {
			System.out.println("number is invalid");	
		}
		else if(n>36267) {
			System.out.println("number is invalid");			
		}
		else {
			int sum=0;
			while(n>0)
	           {
	                 if((n%10)%2!=0)
	                      sum=sum+n%10;
	                  n=n/10;
	           }
	           System.out.println("sum of odd digit is: "+sum);			
			
		}
	}
}
