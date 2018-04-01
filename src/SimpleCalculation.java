/*
 * This program is designed to calculate the exterior surface area of a house
 */


import java.util.Scanner;

/**
 *
 * @author Shruthi
 */
public class SimpleCalculation {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
	    
    	int length,height, width;
    	int noWindow , sizeWindow;
    	int noDoor, sizeDoor;
    	int surfaceArea,windowArea, doorArea, totalArea;
    	
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter the length of the house: ");
    	length = in.nextInt();
    	
    	System.out.println("Enter the height of the house: ");
    	height = in.nextInt();
    	
    	System.out.println("Enter the width of the house: ");
    	width = in.nextInt();
    	
    	System.out.println("Enter the noWindow of the house: ");
    	noWindow = in.nextInt();
    	
    	System.out.println("Enter the sizeWindow of the house: ");
    	sizeWindow = in.nextInt();
    	
    	System.out.println("Enter the noDoor of the house: ");
    	noDoor = in.nextInt();
    	
    	System.out.println("Enter the sizeDoor of the house: ");
    	sizeDoor = in.nextInt();
    	
    	surfaceArea = 2*(length*height)+ 2*(width*height);
    	
    	System.out.println("surfaceArea" + surfaceArea);
    	
    	windowArea = noWindow * sizeWindow;
    	doorArea = noDoor * sizeDoor;
    	
    	totalArea = surfaceArea - (windowArea + doorArea );
    	
    	System.out.println("Total area to be painted : "+ totalArea);
    }
    
}
