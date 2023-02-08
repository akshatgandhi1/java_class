package traninig;

import java.util.*;

public class example1 {
	public static void main(String[] args) {
		System.out.println("enter your salary");
        Scanner myObj = new Scanner(System.in);
        int salary = myObj.nextInt();
        
        
        if(salary>8000){
        System.out.println("salary is greater");
        }
        else if(salary<=0) {
        	System.out.println("salary is to low");
        }
        
        else{
            System.out.println("enter extra working swift");
            double a =(salary * 2/100);
            double swift = myObj.nextInt();
            if(swift<=0) {
            	System.out.println("swift is to low");
            }
            double ss=(salary+a*swift);
            double foodcost=(salary*20/100);
            double travelcost=(salary*30/100);
            double ts=ss-foodcost-travelcost;
            System.out.println("the left out salary is"+ts);
        }
        
        
	}
}
