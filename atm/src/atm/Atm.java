package atm;

import java.util.Locale;
import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		double amount=14256.4132;
		int choice ;
		double withdrawmoney;
		double deposit_amount;
		
		Scanner scan=new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("----------------------------");
		System.out.println("Show  my total money--->1");
		System.out.println("Withdraw--->2");		
		System.out.println("Deposit money into the account--->3");
		System.out.println("Exit the program--->4");
		System.out.println("----------------------------");
	    System.out.println("Enter a choice:");
	    
	    choice=scan.nextInt();
	    switch(choice){
	    
	    case 1:
	    	System.out.println("Total Money:"+amount);

	    	break;

	    case 2:
	    	System.out.println("Enter the price for withdrawing:");
	    	withdrawmoney=scan.nextDouble();
	    	amount-=withdrawmoney;
	    	System.out.println("The balance is:"+amount);
	    	break;
	    	
	    case 3:
	    	System.out.println("How much money do you want to deposit?:");
	    	deposit_amount=scan.nextDouble();
	    	amount+=deposit_amount;
	    	System.out.println("Total Money:"+amount);
	    	break;
	    	
	    case 4:
	    	System.out.println("Closing...");
	    	
	    	break;
	    	
	    default:
	    	System.out.println("Wrong Choice.Please try again:");
	    	choice=scan.nextInt();
	    	break;
	    
	    }
		
		
		
		
		

	}

}
