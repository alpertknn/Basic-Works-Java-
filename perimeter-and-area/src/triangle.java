public class triangle {
	private double height,downside_length,tot,area,rightside_length,leftside_length;
	
	public void  setHeight(double Height){
		
		this.height=Height;
	}
	public double getHeight(){
		
		return height;
		
		
	}
	//////////////////////////////
public void  setDownside_length(double Downside_length){
		
		this.downside_length=Downside_length;
	}
	public double getDownside_length(){
		
		return downside_length;
		
		
	}
	//////////////////////////////
public void  setLeftside_length_length(double Leftside_length){
		
		this.leftside_length=Leftside_length;
	}
	public double getLeftside_length(){
		
		return leftside_length;
		
		
	}
	//////////////////////////////
public void  setRightside_length(double Rightside_length){
		
		this.rightside_length=Rightside_length;
	}
	public double getRightside_length(){
		
		return rightside_length;
		
		
	}
	///////////////////////////////////////////////
	public double perimeter(){
		
		tot=downside_length+leftside_length+rightside_length;
		return tot;
		
	}
	public double area(){
		
		area=(downside_length*height)/2;
		return area;
		
	}
	

}
