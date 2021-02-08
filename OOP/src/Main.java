import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String Color,Brand,Model,new_col,new_model,new_brand;
		int Price,Year,i=0,number,choice,delete,new_reg,new_price,new_year,add_value=0;
		Scanner scan=new Scanner(System.in); 
		Car car[]=new Car[100];
		
		
		System.out.printf("How many information will you create:");
		number=scan.nextInt();
		for(i=0;i<number;i++){
			System.out.println("Enter the Color of the Car:");
			Color=scan.next();
			System.out.println("Enter the  Brand of the Car:");
			Brand=scan.next();
			System.out.println("Enter the Model of the Car:");
			Model=scan.next();
			System.out.println("Enter the Price of the Car:");
			Price=scan.nextInt();
			System.out.println("Enter the Year of the Car:");
			Year=scan.nextInt();
			car[i]=new Car(Color,Brand,Model,Price,Year);
		}
		
	    do{
	    	System.out.println("Enter 1 for adding a register.");
	    	System.out.println("Enter 2 for deleting a register.");
	    	System.out.println("Enter 3 for update a register. ");
	    	System.out.println("Enter 4 for showing all registers. ");
	    	System.out.println("Enter 5 for exit the program.");
	    	System.out.printf("Enter your choice:");
			choice=scan.nextInt();
			switch(choice){
			case 1:
				System.out.println("How many register do you want to create:");
				add_value=scan.nextInt();
				for(i=number;i<(number+add_value);i++){
					System.out.println("Enter the Color of the Car:");
					Color=scan.next();
					System.out.println("Enter the Brand of the Car:");
					Brand=scan.next();
					System.out.println("Enter the Model of the Car:");
					Model=scan.next();
					System.out.println("Enter the Price of the Car:");
					Year=scan.nextInt();
					System.out.println("Enter the Year of the Car:");
					Price=scan.nextInt();
					car[i]=new Car(Color,Brand,Model,Price,Year);
					
				}
				
				
				break;
			case 2:
				System.out.println("Which register do you want to delete?: ");
				delete=scan.nextInt();
				car[delete-1]=new Car("","","",0,0);
				break;
				
			case 3:
				System.out.println("Which register do you want to update?: ");
				new_reg=scan.nextInt();
				System.out.println("Enter the new color:");
				new_col=scan.next();
				System.out.println("Enter the  Brand of the Car:");
				new_brand=scan.next();
				System.out.println("Enter the new model:");
				new_model=scan.next();
				System.out.println("Enter the new price:");
				new_price=scan.nextInt();
				System.out.println("Enter the new year:");
				new_year=scan.nextInt();
				car[new_reg-1]=new Car(new_col,new_brand,new_model,new_price,new_year);
				break;
				
				
			case 4:
				if(add_value!=0){
					for(i=0;i<number+add_value;i++){
						car[i].print();
					}
				}
				else{
					for(i=0;i<number;i++){
						car[i].print();
					}
				}

				break;
				
			case 5:
				System.out.println("The program is closing..");
				break;
				
			default:
				System.out.println("Wrong Choice...Try again.");
				
				break;

			}
			
			
			}while(choice!=5);
	    
	    
	    }
}
