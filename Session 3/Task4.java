/*
 * TASK 4
 * Finish 'ElectricityBill.java' with a 5% early-payment discount on the total
 * when 'paidWithinDue' is true. Ask ChatGPT (free version) to show how to
 * write this discount with the ternary operator, put the line you choose into
 * your program, then run 80 units (H, on time), 180 units (S, summer, late),
 * 600 units (F, summer, on time) and 100 units (X, on time), and paste the
 * four outputs as a comment.
 * Hint: Both sides of '? :' need compatible types, such as double.
 */
public class Task4 {

	public static void main(String[] args) {
		String consumerName = "Ravi Patel";
        int units = 600;
        char category = 'F';          // H = home, S = shop, F = factory
        boolean summer = true;
        boolean paidWithinDue = true;
        
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
        if ((category == 'S' || category == 'F') && summer) {
            if (units > 500) {
                peakSurcharge = 150;
            }
        }

        double total = energyCharge + fixedCharge + peakSurcharge;

        // 5% early-payment discount using the ternary operator
        double finalAmount = paidWithinDue ? total * 0.95 : total;
        
        System.out.println("Consumer       : " + consumerName);
        System.out.println("Units          : " + units);
        System.out.println("Category       : " + category);
        System.out.println("Energy charge  : Rs." + energyCharge);
        System.out.println("Fixed charge   : Rs." + fixedCharge);
        System.out.println("Peak surcharge : Rs." + peakSurcharge);
        System.out.println("Total          : Rs." + total);
        System.out.println("Amount payable : Rs." + finalAmount);
        
	}

}
