package task1;
import java.util.*;

public class ex1 {
	public static void main(String[] args) {
		TreeSet<String> name=new TreeSet<String>();
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		for(int i=0;i<=number;i++) {
			String playername=sc.nextLine();
			name.add(playername);
		}
		 Iterator<String> itr=name.iterator();  
		  while(itr.hasNext()){  
			   System.out.println(itr.next());  
			  }  	
	}
}
