
public class Car {
	private  String color;
	private  String model;
	private String  brand;
	private  int price;
	private  int year;
	
	public Car(String Color,String Model,String Brand,int Price,int Year){
		this.color=Color;
		this.model=Model;
		this.brand=Brand;
		this.price=Price;
		this.year=Year;
	}
	
    public Car(){
    	this.color="";
		this.model="";
		this.brand="";
		this.price=0;
		this.year=0;
		}
	
    /*	 We can do with Getters and Setters,but for the other way  it needs some fixes.
    //////////////////////////////////////////////////////////////////////////////////////
	public String getColor() {
	    return color;
	  }
public void setColor(String Color) {
	    this.color = Color;
	  }
	  public String getModel() {
		return model;
		}
	public void setModel(String Model) {
		this.model = Model;
		}
		public String getBrand() {
		return brand;
		}
	public void setBrand(String Brand) {
		this.brand = Brand;
		}
		public int getPrice() {
	    return price;
	    }
	public void  setPrice(int Price) {
	    this.price = Price;
	    }
	    public int getYear() {
	    return year;
	    }
	public void  setYear(int Year) {
	    this.year = Year;
	    }*/
    
    public  void print(){
    	System.out.println("Car's color is:"+color);
    	System.out.println("Car's model is:"+model);
    	System.out.println("Car's brand is:"+brand);
    	System.out.println("Car's price is:"+price+"£");
    	System.out.println(year);
    	
    }
    

}
