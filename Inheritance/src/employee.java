public class employee {
	private String name,department;
	private int id;
	public employee (){
		name="";
		department="";
		id=0;
		
	}
	
	public employee(String Name, String Department, int Id) {
		this.id=Id;
		this.name=Name;
		this.department=Department;
	}
	public void print(){
		System.out.println("The id :"+this.id);
		System.out.println("The id :"+this.name);
		System.out.println("The id :"+this.department);
		
		
		
		
		
	}
	
	

}
