package task7;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,ArrayList<wicket>> hm=new HashMap<>();
		String choice="yes";
		while(choice.equals("yes")) 
			
		{System.out.println("Enter the player name:");	
		ArrayList<wicket> wickets=new ArrayList<wicket>();
		String name=sc.nextLine();
		System.out.println("Enter wickets - seperated by '|' symbol ");
		String wicketsInput[]=sc.nextLine().split("\\|");
		
		
		for(String wicket:wicketsInput)
		{
			wickets.add(new wicket(wicket,new blower(wicket)));
		}
		System.out.println("Do you want to add another player (yes/no)");
		choice=sc.nextLine();
		
		hm.put(name, wickets);
		}
		String choice1="yes";
		
		do{
			System.out.println("Enter the player name to search");
			String name=sc.nextLine();
			if(hm.containsKey(name))
			{
				System.out.println("Player name :"+name);
				ArrayList<wicket> wicketsForPlayer=hm.get(name);
				for(wicket wicket:wicketsForPlayer)
				{
					System.out.println(wicket.getPlayername());
				}
			}
			else
			{
				System.out.println("Player not found");

			}
			choice1=sc.nextLine();
	}while(choice1.equals("yes"));
}
}
