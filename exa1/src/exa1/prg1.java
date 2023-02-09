package exa1;
import java.util.*;

public class prg1 {
	public static void main(String args[]) {
		System.out.println("enter the array number");
		int evenSum=0,oddSum=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0) {
			
		
		int[] a=new int[10];
		System.out.println("enter the array ");
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(a[i]<0) {
				System.out.println("-value is entered");
			}
		}
		
		
		for(int i=0; i<n; i++){
			if(a[i]%2==0){
			evenSum=evenSum+a[i];
			}
			else{
			oddSum=oddSum+a[i];
			}
			}
			
			if(evenSum>=oddSum) {
				System.out.println("\nsum is: "+evenSum);
					
			}
			else {
				System.out.println("\nSum is: "+oddSum);
					
			}
			}
		else {
			System.out.println("number is negative");
		}
	}
}

