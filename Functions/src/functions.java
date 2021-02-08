import java.util.Scanner;


public class functions {

	public static void main(String[] args) {
		int result,number;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number for finding to factorial:");
		number=scan.nextInt();
		result=factorial(number);
		System.out.println("The resul is:"+result);
		

	}
	
	public static int factorial(int number){
		
		int i,no=1;
		for(i=1;i<=number;i++){
			no*=i;
		}
		return no;
	}

}
