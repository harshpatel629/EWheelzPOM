

/**
 * Program Name:Apartment.java
 * Author: Harsh Patel
 * Date: Aug 2, 2022
 * Purpose: To provide further concreteness to the structure extending from the RowHouse class
*/
public class Apartment extends RowHouse {
	
	//Declaring class variables
	private int numLevels;
	private int parkingSpace; // (getNumUnits() * this.numLevels) +  (getNumUnits() * this.numLevels)/ 4;
	
	 

	//Creating constructors
	public Apartment (double length, double width, int floors, int unit, int beds, int baths, int levels) {
		super("Apartment", length, width, floors, unit, beds, baths);
		this.numLevels = levels;
		this.parkingSpace = (getNumUnits() * this.numLevels) +  (getNumUnits() * this.numLevels)/ 4;
	
		
	}
	
	
	//Getters and Setters
	public int getNumLevels() {
		return numLevels;
	}

	public void setNumLevels(int numLevels) {
		this.numLevels = numLevels;
	}

	public int getParkingSpace() {
		return parkingSpace;
	}

	public void setnumParkingSpace(int parkingSpace) {
		this.parkingSpace = (getNumUnits() * this.numLevels) +  (getNumUnits() * this.numLevels)/ 4;
	}
	
	
	//Utility methods
	/*
	 * Method Name: getBuildingDetails()
	 *     Purpose: to get Apartment details
	 *     Accepts: nothing
	 *     Returns: nothing
	 */
	
	public void getBuildingDetails() {
		
		
		
		System.out.println("Building Type: " + this.getType() + " which has " + this.getNumUnits() + " living units on one level.");
		System.out.println("Unit Area: " + this.getArea() + " square feet on " + this.getNumFloors() + " floor(s).");
		System.out.println("Total area of all units on one floor is " + this.getArea() * this.getNumUnits() + " square feet.");
		System.out.println("Number of bedrooms: " + this.getNumBeds() + ". Number of bathrooms: " + this.getNumBaths() + ".");
		System.out.println("This " + this.getType() + " building has " + this.numLevels + " level(s) for a total of number of "+ this.getNumUnits() * this.numLevels + " units.");
		System.out.println("This complex has " + this.parkingSpace + " parking spaces available.");
		
	}
	

} //End of class
