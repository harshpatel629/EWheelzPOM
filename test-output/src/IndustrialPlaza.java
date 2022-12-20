/**
 * 
 */

/**
 * Program Name:IndustrialPlaza.java
 * Author: Harsh Patel
 * Date: Aug 1, 2022
 * Purpose: To provide further concreteness to the structure from the super class
*/
public class IndustrialPlaza extends Warehouse {
	
	//Declaring class variables
	private int numUnits;
	private String usage;
	
	
	//Creating Constructors
	public IndustrialPlaza (double length, double width, int numFloors, double pStorage, int rooms, int units, String usage) {
		
		super("Industrial Plaza", length, width, numFloors, pStorage, rooms);
		this.numUnits = units;
		this.usage = usage;
	}
	

	//Getters and Setters
	public int getNumUnits() {
		return numUnits;
	}


	public void setNumUnits(int numUnits) {
		this.numUnits = numUnits;
	}


	public String getUsage() {
		return usage;
	}


	public void setUsage(String usage) {
		this.usage = usage;
	}
	
	//Utility Methods
	/*
	 * Method Name: getBuildingDetails()
	 *     Purpose: to get Industrial Plaza building details
	 *     Accepts: Nothing
	 *     Returns: Nothing
	 */
	
	public void getBuildingDetails() {
		
		System.out.println("Building Type: " + this.getType() + ".");
		System.out.println("Area: " + this.getArea() + " square feet on " + this.getNumFloors() + " floor(s).");
		System.out.println("Number of Rooms in each unit: " + this.getNumRooms() + " room(s) with storage accounting for " + this.getPercentStorage() + " percent of the space.");
		System.out.println("We have " + this.numUnits + " units with a combined total area of " + Math.round(this.getArea() * this.numUnits*10)/10.0 + " square feet.");
		System.out.println("This " + this.getType() + " is designated for "+ this.usage + " only.");
	}
	

} // End of class
