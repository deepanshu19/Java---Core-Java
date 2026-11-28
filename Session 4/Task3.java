/* TASK 3
 * Add nested for loops to print the demand for 3 floors with 4 flats each
 * (flats 101 to 104, 201 to 204 and 301 to 304) at Rs.1,800 per flat and
 * Rs.2,200 on floor 3. Use 'continue' to skip vacant flats whose number ends
 * in 04, and 'break' to stop as soon as the running demand crosses Rs.15,000.
 * Keep the final figure in a variable 'totalDemand'.
 */
public class Task3 {

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
	        
	       
	        for(int floor=1;floor<=3;floor++)
	        {
	        	int rate = (floor == 3)?2200:1800;
	        	
	        	for(int flat =1;flat<=4;flat++)
	        	{
	        		int flatNumber = floor * 100 +flat;
	        		
	        		if(flatNumber % 100 == 4) {
	        			continue;
	        		}
	        		
	        		totalDemand += rate;
	        		
	        		System.out.println("Flat " + flatNumber + ": Rs." + rate
	                        + "  | running demand = Rs." + totalDemand);
	        		
	        		if(totalDemand > 15000)
	        		{
	        			System.out.println("Running demand crossed Rs.15,000. Stopping.");
	        			break;
	        		}
	        	}
	        }
	        
	        System.out.println("Total demand: Rs." + totalDemand);

	}

}
