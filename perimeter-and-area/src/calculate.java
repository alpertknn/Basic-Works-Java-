import java.util.Scanner;
public class calculate {

	public static void main(String[] args) {
		
		int choice;
		Scanner scan=new Scanner(System.in);
		do{
		System.out.println("Enter 1 for calculating square's area and perimeter:");
		System.out.println("Enter 2 for calculating rectangle's area and perimeter:");
		System.out.println("Enter 3 for calculating triangle's area and perimeter:");
		System.out.println("Enter 4 for exit the program..");
		System.out.println("Enter your choice:");
		choice=scan.nextInt();
		
		switch(choice){
		case 1:
			square square=new square();
			System.out.println("Enter the length:");
			square.setLength(scan.nextDouble());
			System.out.println("The perimeter is:"+square.perimeter());
			System.out.println("The area is:"+square.area());
			
			break;
			
		case 2:
			rectangle rectangle=new rectangle();
			System.out.println("Enter the left length:");
			rectangle.setLength_left(scan.nextDouble());
			System.out.println("Enter the top length:");
			rectangle.setLength_top(scan.nextDouble());
			System.out.println("The perimeter is:"+rectangle.perimeter());
			System.out.println("The area is:"+rectangle.area());
			
			break;
			
		case 3:
			triangle triangle=new triangle();
			System.out.println("Enter the down length:");
			triangle.setDownside_length(scan.nextDouble());
			System.out.println("Enter the left length:");
			triangle.setLeftside_length_length(scan.nextDouble());
			System.out.println("Enter the right length:");
			triangle.setRightside_length(scan.nextDouble());
			System.out.println("Enter the height for calculating area:");
			triangle.setHeight(scan.nextDouble());
			System.out.println("The perimeter is:"+triangle.perimeter());
			System.out.println("The area is:"+triangle.area());
			break;
		
		
		default:
			break;
		
		}
		}while(choice!=4);
		

	}

}
