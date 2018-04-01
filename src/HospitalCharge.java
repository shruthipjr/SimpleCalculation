import java.util.Scanner;

public class HospitalCharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int stayType;
		int total;
		int hosCharge, MedCharge, labCharge;
		int loop;
		Scanner in = new Scanner(System.in);
		
	
		do{
			System.out.println("if the stay is overnight enter 1 else 2 ");
			stayType = in.nextInt();
			
			if(stayType == 1){
				
			System.out.println("Enter hospital overnight charges:");
			hosCharge = in.nextInt();
				
		}
		
		else {
			
			hosCharge = 0;
					
		}
			
			System.out.println("Enter medication charges and lab service charges :");
			MedCharge = in.nextInt();
			labCharge = in.nextInt();
			total = hosCharge + MedCharge + labCharge;
			System.out.println("The total chareg is :"+total );
			System.out.println("if you want to calculate for one more then enter 1 else 2 ");
			loop = in.nextInt();
		
		}while(loop == 1);
	}

}
