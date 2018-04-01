import java.util.Scanner;

public class TravelCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 double distance;
		 double mpg;
		 double pricePerGallopn;
		 double totalPrice;
		 
		 Scanner c = new Scanner(System.in);
		 System.out.println("Enter distance: ");
		 distance = c.nextDouble();
		 
		 System.out.println("enter mpg: ");
		 mpg = c.nextDouble();
		 
		 System.out.println("Enter price: ");
		 pricePerGallopn = c.nextDouble();
		 
		 
		 totalPrice = (distance/mpg)*pricePerGallopn;
		 System.out.printf("The total price is $"+totalPrice);
		 
	}

}
