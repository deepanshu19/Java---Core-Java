/* TASK 4
 * Finish 'MaintenanceRegister.java' with a do-while loop that asks
 * 'Enter amount received (0 to stop)', adds each amount to the total
 * collected, prints the running total, and always asks at least once.
 * Test with 1800, 2200, 1800 and 0, then print the pending amount
 * (totalDemand minus collected).
 * Hint: Read numbers with java.util.Scanner:
 *       Scanner sc = new Scanner(System.in);  then  sc.nextInt()
 */
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		
        System.out.println("=== 12-Month Maintenance Table ===");
        System.out.println("Month    Amount    Running Total");

        int runningTotal = 0;

        for (int month = 1; month <= 12; month++) {
            int amount;
            if (month <= 6) {
                amount = 1800;
            } else {
                amount = 2000;
            }
            runningTotal += amount;
            System.out.printf("%5d %9d %16d%n", month, amount, runningTotal);
        }

        
        System.out.println();
        System.out.println("=== Clearing Arrears ===");

        int balance = 28000;
        int monthlyPayment = 2500;
        int monthsTaken = 0;

        while (balance > 0) {
            balance -= monthlyPayment;
            monthsTaken++;
            System.out.println("After payment " + monthsTaken + ": balance = Rs." + balance);
        }

        int overpaid = -balance;   // balance is zero or negative here
        System.out.println("Months taken : " + monthsTaken);
        System.out.println("Overpaid     : Rs." + overpaid);

        
        System.out.println();
        System.out.println("=== Society Demand ===");

        int totalDemand = 0;

        
        for (int floor = 1; floor <= 3; floor++) {
            int rate = (floor == 3) ? 2200 : 1800;

            for (int flat = 1; flat <= 4; flat++) {
                int flatNumber = floor * 100 + flat;   // 101..104, 201..204, 301..304

                if (flatNumber % 100 == 4) {
                    continue;   
                }

                totalDemand += rate;
                System.out.println("Flat " + flatNumber + ": Rs." + rate
                        + "  | running demand = Rs." + totalDemand);

                if (totalDemand > 15000) {
                    System.out.println("Running demand crossed Rs.15,000. Stopping.");
                    break;
                }
            }
        }

        System.out.println("Total demand: Rs." + totalDemand);
        
        System.out.println();
        System.out.println("=== Collection ===");
        
        Scanner sc = new Scanner(System.in);
        int totalCollected = 0;
        int received;
        
        do {
        	System.out.println("Enter amount received (0 to stop): ");
        	received = sc.nextInt();
        	totalCollected += received;
        	System.out.println("Running total collected: Rs." + totalCollected);
        	
        }while(received !=0);
        
        int pending = totalDemand - totalCollected;
        
        System.out.println("Total demand    : Rs." + totalDemand);
        System.out.println("Total collected : Rs." + totalCollected);
        System.out.println("Pending amount  : Rs." + pending);
        
        sc.close();

	}

}
