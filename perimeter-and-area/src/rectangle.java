public class rectangle {
	private double length_left,length_top,total,area;
	
	public void setLength_left(double Length_left) {
		this.length_left = Length_left;
		}
	public double getLength_left() {
		return length_left;
		}
	////////////////////////////////////////////////
	public void setLength_top(double Length_top) {
		this.length_top = Length_top;
		}
	public double getLength_top() {
		return length_top;
		}
	///////////////////////////////////////////////
	public double perimeter(){
		
		total=2*length_top+2*length_left;
		return total;
		
	}
	public double area(){
		
		area=length_left*length_top;
		return area;
		
	}

}
