import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		String name,department;
		manager manager[] =new manager[100];
		int id,i,max;
		Scanner scan=new Scanner(System.in);
		System.out.println("How many register will you enter:");
		max=scan.nextInt();
		for(i=0;i<max;i++){
			System.out.println("Enter the employee's name:");
			name=scan.next();
			System.out.println("Enter the employee's department:");
			department=scan.next();
			System.out.println("Enter the employee's id:");
			id=scan.nextInt();
			manager[i]=new manager(name,department,id);
			
		}
		manager[0].print();
	

	}

}
