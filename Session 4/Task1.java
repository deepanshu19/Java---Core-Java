/*
 * TASK 1
 * Write 'MaintenanceRegister.java' for a fictional society, using a for loop
 * to print a 12-month maintenance table for one flat that shows the month
 * number, the amount and the running total. The amount is Rs.1,800 for months
 * 1 to 6 and Rs.2,000 for months 7 to 12.
 * Constraint: Do not use arrays; they are not taught yet.
 */
public class Task1 {

	public static void main(String[] args) {
		 System.out.println("=== 12-Month Maintenance Table ===");
	     System.out.println("Month    Amount    Running Total");
	     
	     int runningTotal = 0;
	     
	     for(int month=1;month<=12;month++)
	     {
	    	 int amount;
	    	 if(month<=6)
	    	 {
	    		 amount = 1800;
	    	 }else {
	    		 amount = 2000;
	    	 }
	    	 
	    	 runningTotal += amount;
	    	 System.out.printf("%5d %9d %16d%n", month, amount, runningTotal);
	     }

	}

}
