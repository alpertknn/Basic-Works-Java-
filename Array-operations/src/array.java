import java.util.Scanner;


public class array {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double []rainfall= new double[12];
		String [] month={"January","February","March","April","May","June","July","August","September","October","November","December"};
		int i,choice;	
		double tot=0;
		for (i=0;i<12;i++){
			System.out.println("Enter the "+(i+1)+". register:");
			rainfall[i]=scan.nextDouble();
			tot+=rainfall[i];
		}
		System.out.println("-------Select one choice-------");
		System.out.println("Enter 1 for sum of 12 month's rainfall..");
		System.out.println("Enter 2 for showing each month's rainfall..");
		System.out.println("Enter 3 for exit the program..");
		System.out.println("--------------------------------");
		do{
		System.out.println("Enter your choice:");
		choice=scan.nextInt();
		switch(choice){
		case 1:
			System.out.println("The summation is: "+tot);
			break;
			
		case 2:
			for(i=0;i<12;i++){
				System.out.println(month[i]+" is: "+rainfall[i]);
			}
			break;
		
		case 3:
			System.out.println("Closing...");
			break;
			
		default:
		
			break;
		
            
	}
		}while(choice!=3);
	}
}
