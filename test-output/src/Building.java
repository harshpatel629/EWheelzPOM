

/**
 * Program Name:Building.java
 * Author: Harsh Patel
 * Date: Aug 1, 2022
 * Purpose: To define high-level properties of a building
*/
public abstract class Building {
	
	//Declaring class variables
	private String type;
	private double length;
	private double width;
	private int numFloors;
	
	
	//Creating constructors
	public Building (String type, double length, double width, int numFloors) {
		
		this.type = type;
		this.length = length;
		this.width = width;
		this.numFloors = numFloors;
	}

	
	//Getters and Setters
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public int getNumFloors() {
		return numFloors;
	}

	public void setNumFloors(int numFloors) {
		this.numFloors = numFloors;
	}

	public String getType() {
		return type;
	}
	
	//Creating an abstract method to get details
	public abstract void getBuildingDetails();
	
	
	//Utility method
	/*
	 * Method Name: getArea()
	 *     Purpose: to determine the area
	 *     Accepts: nothing
	 *     Returns: double
	 */

	public double getArea() {
		
		return Math.round(this.length * this.width * this.numFloors*10)/10.0;
	}
}//End of class
