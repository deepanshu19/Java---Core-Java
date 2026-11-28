 /* TASK 2
 * Extend 'MaintenanceRegister.java' with a while loop for one flat that has
 * opening arrears of Rs.28,000 and pays Rs.2,500 every month: print the
 * balance after each payment, stop when it reaches zero or below, then print
 * how many months it took and the amount overpaid
 * (expected: 12 months and Rs.2,000).
 */
public class Task2 {

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

	}

}
