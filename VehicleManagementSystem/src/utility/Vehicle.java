package utility;

public class Vehicle {
	private String make, model, year, mileage;
	public String name;

    
    public Vehicle(String make, String model, String year, String mileage, String name) {// overloaded constructor 
        this.make = make;
        this.model = model;	   
        this.year = year;
        this.mileage = mileage;
        this.name = name;
    }
     
    public void printDetails() {
    	System.out.println("The vehicles in vehicle management system are:");
        System.out.println("Make: "+make +", Model: "+model + ", Year: "+ year + ", Mileage: "+ mileage+ ", Owner Name: "+name);
    }
}
