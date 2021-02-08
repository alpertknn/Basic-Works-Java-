public class square {
	private double length,total,area;
	
	public void setLength(double Length) {
		this.length = Length;
		}
	public double getLength() {
		return length;
		}
	public double perimeter(){
		
		total=4*length;
		return total;
		
	}
	public double area(){
		
		area=length*length;
		return area;
		
	}
	
}
