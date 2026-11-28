/*
 * TASK 3
 * Add a nested if to 'ElectricityBill.java': when the consumer is a shop or a
 * factory and the boolean 'summer' variable is true, a peak-load surcharge of
 * Rs.150 applies only if the units are above 500. Homes never pay it.
 * Hint: Put the category check inside parentheses when joining with ||,
 * then test the units in an inner if.
 */

public class Task3 {

	public static void main(String[] args) {
		String consumerName = "Ravi Patel";
		int units = 600;
		char category = 'F'; // H = home, S = shop, F = factory
		boolean summer = true;
		
		double energyCharge;
		
		if (units <= 100) {
            energyCharge = units * 3.00;
        } else if (units <= 250) {
            energyCharge = 100 * 3.00 + (units - 100) * 4.60;
        } else {
            energyCharge = 100 * 3.00 + 150 * 4.60 + (units - 250) * 6.80;
        }
		
		double fixedCharge;
		
		 switch (category) {
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
		 
		 // Peak-load surcharge: shops/factories, in summer, above 500 units
		 double peakSurcharge = 0;
		 if((category == 'S' || category == 'F') && summer)
		 {
			 if(units > 500)
			 {
				 peakSurcharge = 150;
			 }
		 }
		 
		 double total = energyCharge + fixedCharge + peakSurcharge;
		 
		 System.out.println("Consumer       : " + consumerName);
	     System.out.println("Units          : " + units);
	     System.out.println("Category       : " + category);
	     System.out.println("Energy charge  : Rs." + energyCharge);
	     System.out.println("Fixed charge   : Rs." + fixedCharge);
	     System.out.println("Peak surcharge : Rs." + peakSurcharge);
	     System.out.println("Total          : Rs." + total);
	}

}
