/*
 * TASK 1
 * Write 'ElectricityBill.java' with a consumer name and units consumed stored
 * in variables, and calculate the energy charge with if, else-if and else,
 * charging each slab only for the units inside it:
 *   - first 100 units            at Rs.3.00
 *   - next 150 units (101-250)   at Rs.4.60
 *   - units above 250            at Rs.6.80
 * Print the charge for 80, 180 and 320 units by changing the variable between
 * runs (expected Rs.240, Rs.668 and Rs.1,466).
 * Constraint: Do not use loops.
 */

public class Task1 {

	public static void main(String[] args) {
		String consumerName = "Ravi Paatel";
		int units = 320;
		
		double energyCharge;
		
		if(units <= 100) {
			energyCharge = units * 300;
		}
		else if(units<=250) {
			energyCharge = 100 * 3.00 + (units - 100) * 4.60;
		}else {
			energyCharge = 100 * 3.00 + 150 * 4.60 + (units - 250) * 6.80;
		}
			
		System.out.println("Consumer     : " + consumerName);
        System.out.println("Units        : " + units);
        System.out.println("Energy charge: Rs." + energyCharge);
	}

}
