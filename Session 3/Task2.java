/*
 * TASK 2
 * Extend 'ElectricityBill.java' with a char consumer category
 * ('H' for home, 'S' for shop, 'F' for factory) and use a switch statement
 * to set the fixed charge: Rs.30 for H, Rs.90 for S and Rs.250 for F.
 * For any other letter, print 'Unknown category' and set the fixed charge
 * to Rs.0.
 * Constraint: Use the classic 'case ...: break;' style with a default case.
 */

public class Task2 {

	public static void main(String[] args) {
		String consumerName = "Ravi Patel";
		int units = 180;
		char category = 'H'; // H = home, S = shop, F = factory
		
		double energyCharge;
		
		if(units <= 100)
		{
			energyCharge = units * 3.00;
		}else if(units <= 250) {
			energyCharge = 100 * 3.00 + (units - 100) * 4.60;
		}else {
			energyCharge = 100 * 3.00 + 150 * 4.60 + (units - 250) * 6.80;
		}
		
		double fixedCharge;
		
		switch(category) {
		case 'H':
			fixedCharge = 30;
			break;
		case 'S':
			fixedCharge = 90;
			break;
		case 'F':
			fixedCharge = 250;
			break;
			
		default:
			System.out.println("Unknown category");
			fixedCharge = 0;
			break;
		}
		
		System.out.println("Consumer     : " + consumerName);
        System.out.println("Units        : " + units);
        System.out.println("Category     : " + category);
        System.out.println("Energy charge: Rs." + energyCharge);
        System.out.println("Fixed charge : Rs." + fixedCharge);
		
	}

}
