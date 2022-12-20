

/**
 * Program Name:ConstructBuilding.java
 * Author: Harsh Patel
 * Date: Aug 1, 2022
 * Purpose: A driver class to implement the methods of the Building class and its subclasses.
*/
public class ConstructBuilding {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Creating objects of each of the subclasses 
		Warehouse w1 = new Warehouse(10,20,2,20,3);
		IndustrialPlaza i1 = new IndustrialPlaza(51.3,10.6,6,25,5,6, "Manufacture");
		RowHouse r1 = new RowHouse(5.6,10.1,4,3,4,5);
		Apartment a1 = new Apartment(13.6,44.5,5,8,7,8,4);
		
		//Creating an array of the Building type to store the created objects
		Building [] buildingArray = new Building[4];
		
		buildingArray[0] = w1;
		buildingArray[1] = i1;
		buildingArray[2] = r1;
		buildingArray[3] = a1;
		
		//Printing the title
		System.out.println("\t\t\tMY BUILDING EMPIRE\t\t\t\n\t\t\t******************\t\t\t\n");
		
		//Calling the getBuildingDetails() method to print the details of each object by using a for loop
		for (int i = 0; i<buildingArray.length;i++) {
			
			buildingArray[i].getBuildingDetails();
			System.out.println();
		}
		

		// Mutating the Apartment object by using the Mutator/Setter methods
		a1.setNumLevels(10);
		a1.setNumUnits(21);
		a1.setLength(34.5);
		a1.setNumBaths(4);
		a1.setNumBeds(6);
		a1.setNumFloors(9);
		a1.setWidth(25.1);
		a1.setnumParkingSpace(0);
		
		
		//Calling the getBuildingDetails() method for the Apartment object to display the changes
		System.out.println("Mutating the Apartment object:\n");
		
		a1.getBuildingDetails();
		
		
	
		//Using the Getter methods for each object to display the details
	
		System.out.println("\nAnalyzing each element of the building");
		
		System.out.println("\nType of building: " + w1.getType());
		System.out.println("Unit Length: " + w1.getLength());
		System.out.println("Unit Width: " + w1.getWidth());
		System.out.println("Number of floors: " + w1.getNumFloors());
		System.out.println("Area of this unit: " + w1.getArea());
		System.out.println("Number of rooms in this unit: " + w1.getNumRooms());
		System.out.println("Storage space in this unit: " + w1.getPercentStorage());
		
		System.out.println();
		
		System.out.println("Type of building: " + i1.getType());
		System.out.println("Unit Length: " + i1.getLength());
		System.out.println("Unit Width: " + i1.getWidth());
		System.out.println("Number of floors in each unit: " + i1.getNumFloors());
		System.out.println("Area of this unit: " + i1.getArea());
		System.out.println("Number of rooms in this unit: " + i1.getNumRooms());
		System.out.println("Storage space in this unit: " + i1.getPercentStorage());
		System.out.println("Number of unts in this industrial plaza: " + i1.getNumUnits());
		System.out.println("This industrial plaza is designated for " + i1.getUsage() + " usage");
		
		System.out.println();
		
		System.out.println("Type of building: " + r1.getType());
		System.out.println("Unit Length: " + r1.getLength());
		System.out.println("Unit Width: " + r1.getWidth());
		System.out.println("Number of floors in each unit: " + r1.getNumFloors());
		System.out.println("Area of this unit: " + r1.getArea());
		System.out.println("Number of bathrooms in each unit: " + r1.getNumBaths());
		System.out.println("Number of bedrooms in each unit: " + r1.getNumBeds());
		System.out.println("Number of units: " + r1.getNumUnits());
		
		System.out.println();
		
		System.out.println("Type of building: " + a1.getType());
		System.out.println("Unit Length: " + a1.getLength());
		System.out.println("Unit Width: " + a1.getWidth());
		System.out.println("Number of floors in each unit: " + a1.getNumFloors());
		System.out.println("Area of this unit: " + a1.getArea());
		System.out.println("Number of bathrooms in each unit: " + a1.getNumBaths());
		System.out.println("Number of bedrooms in each unit: " + a1.getNumBeds());
		System.out.println("Number of units on each level: " + a1.getNumUnits());
		System.out.println("Number of levels in this apartment building: " + a1.getNumLevels());
		System.out.println("Number of parking spaces available: " + a1.getParkingSpace());

	}//End of main method

}//End of class
