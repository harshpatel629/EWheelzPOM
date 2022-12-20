

/**
 * Program Name:Warehouse.java
 * Author: Harsh Patel
 * Date: Aug 1, 2022
 * Purpose: To define more concrete properties of a structure to be built
*/
public class Warehouse extends Building {
	
	//Declaring class variables
	private double percentStorage;
	private int numRooms;
	
	
	//Creating constructors
	public Warehouse (double length, double width, int numFloors, double pStorage, int rooms) {
		
		super("Warehouse",length, width, numFloors);
		this.percentStorage = pStorage;
		this.numRooms = rooms;
	}
	
	public Warehouse (String type, double length, double width, int numFloors, double pStorage, int rooms) {
		
		super(type, length, width, numFloors);
		this.percentStorage = pStorage;
		this.numRooms = rooms;
	}
	
	
	//Getters and Setters
	public double getPercentStorage() {
		return percentStorage;
	}

	public void setPercentStorage(double percentStorage) {
		this.percentStorage = percentStorage;
	}

	public int getNumRooms() {
		return numRooms;
	}

	public void setNumRooms(int numRooms) {
		this.numRooms = numRooms;
	}

	@Override
	
	//Utility methods
	/*
	 * Method Name: getBuildingDetails()
	 *     Purpose: to get Warehouse details
	 *     Accepts: nothing
	 *     Returns: nothing
	 */
	
	public void getBuildingDetails() {
		
		System.out.println("Building Type: " + this.getType() +".");
		System.out.println("Unit Area: " + this.getArea() + " square feet on " + this.getNumFloors() + " floor(s).");
		System.out.println("Number of Rooms: " + this.numRooms + " room(s) with storage accounting for " + this.percentStorage + " percent of the storage space.");
		
		
	}
	
	

}//End of class
