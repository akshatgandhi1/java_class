package exa1;
import java.util.*;

public class prg2 {
	
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			if(n < 0) {
				System.out.println("Invalid array size");
			}
			else {
				int[] arr = new int[n];
				for(int i=0; i<n; i++) {
					arr[i] = s.nextInt();
				}
				
				int score = s.nextInt();
				
				for(int i =0 ; i<n; i++) {
					if(arr[i] < 0) {
						System.out.println("Invalid input");
					}
					else {
						if(arr[i] > score) {
							System.out.println(arr[i-1]);
						}
					}
					
					
				}
			}
			
		}
}
