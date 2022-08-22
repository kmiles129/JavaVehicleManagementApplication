package utility;
import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class

public class Utility {
	private String make, model, year, mileage, name;
	ArrayList<Vehicle> vehicles  = new ArrayList<Vehicle>();
	public void addVehicle() { // Method to add vehicle info to vehicles arraylist
		 
		getInfo();
		//Vehicle elementName = new Vehicle(make, model, year, mileage, name);
		vehicles.add(new Vehicle(make, model, year, mileage, name));
		System.out.println("Vehicle has beem added!!");
		askQuestion();
		
	}
	public void getInfo() {	// Method to get Vehicle information from user 			
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Welcome! Lets add your vehicle to the management system.");
		System.out.println("Please type below your vehicle make.");
		String input = myObj.nextLine();  // Read user input
		make = input;
				 
		System.out.println("Please type below your vehicle model.");
		input = myObj.nextLine();  // Read user input
		model = input;	
				 
		System.out.println("Please type below your vehicle year.");
		input = myObj.nextLine();  // Read user input
		year = input;	
				 
		System.out.println("Please type below your vehicle mileage.");
		input = myObj.nextLine();  // Read user input
		mileage = input;
				 
		System.out.println("Please type below your vehicle owner name.");
		input = myObj.nextLine();  // Read user input
		name = input;
				 
		//myObj.close();
		}
	public void askQuestion() {// Method to ask questions 
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Would you like to add another vehicle to the management system. ");
		System.out.println("Please type \"yes\" or \"no\"");
		String input = myObj.nextLine();  // Read user input
		if (input.equalsIgnoreCase("yes")) {
			addVehicle();
		}
		else if (input.equalsIgnoreCase("no")){
			System.out.println("Would you like to delete a Vehicle from the management system?");
			System.out.println("Please type \"yes\" or \"no\"");
			input = myObj.nextLine();  // Read user input
			
			if (input.equalsIgnoreCase("yes")){
				System.out.println("Please type the owner name of Vehicle you would like to delete");
				input = myObj.nextLine();  // Read user input
				deleteVehicle(input);
			}
			else {
				printDetails();
			}
		}
		myObj.close();
	}
	
	
	public void deleteVehicle (String pass) {// Method to delete Vehicle
			 for(int i = 0; i<vehicles.size(); i++) {
		      if (vehicles.get(i).name.equalsIgnoreCase(pass)) {
		    	  System.out.println("Vehicle own by "+ vehicles.get(i).name+ " is now deleted.");    
		    	  System.out.println("Here is a list of vehicles listed in the vehicles management system");
		    	  printDetails();
		      }
		      else {
		    	 System.out.println("Vehicle own by "+ pass+ " is not in vehicle management system.");
		    	 System.out.println("Please come back later to check again !!!");
		      }
			 }

	}
	public void printDetails() {// Method to print details of Vehicles in the management system. 
		for(Vehicle car: vehicles) {
	            car.printDetails();
	        }
		 System.out.println("Please come back later to check again !!!");
	}

	}


	

