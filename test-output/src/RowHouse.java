

/**
 * Program Name:RowHouse.java
 * Author: Harsh Patel
 * Date: Aug 2, 2022
 * Purpose: To provide more concrete details about the structure
*/
public class RowHouse extends Building {
	
	//Declaring class variables
	private int numUnits;
	private int numBeds;
	private int numBaths;
	
	//Creating constructors
	public RowHouse (double length, double width, int floors, int unit, int beds, int baths) {
		
		super ("RowHouse", length, width, floors);
		this.numUnits = unit;
		this.numBeds = beds;
		this.numBaths = baths;
	}

	public RowHouse (String type, double length, double width, int floors, int unit, int beds, int baths) {
		
		super(type, length, width, floors);
		this.numUnits = unit;
		this.numBeds = beds;
		this.numBaths = baths;
	}
	
	//Getters and Setters
	public int getNumUnits() {
		return numUnits;
	}

	public void setNumUnits(int numUnits) {
		this.numUnits = numUnits;
	}

	public int getNumBeds() {
		return numBeds;
	}

	public void setNumBeds(int numBeds) {
		this.numBeds = numBeds;
	}

	public int getNumBaths() {
		return numBaths;
	}

	public void setNumBaths(int numBaths) {
		this.numBaths = numBaths;
	}
	
	//Utility Methods
	/*
	 * Method Name: getBuildingDetails()
	 *     Purpose: to get RowHouse details
	 *     Accepts: nothing
	 *     Returns: nothing
	 */
	
	public void getBuildingDetails() {
		
		System.out.println("Building Type: " + this.getType() + " which has "+ this.numUnits + " living unit(s) on one level.");
		System.out.println("Unit Area: " + this.getArea() + " square feet on " + this.getNumFloors() + " Floor(s).");
		System.out.println("Total area of all units on one floor is " + Math.round(this.getArea() * this.numUnits*10)/10.0 + " square feet.");
		System.out.println("Number of bedrooms: " + this.numBeds + ". Number of bathrooms: " + this.numBaths + ".");
		
	}
}//End of class
