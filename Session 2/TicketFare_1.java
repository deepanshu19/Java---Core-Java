
public class TicketFare_1 {

	public static void main(String[] args) {
		String passengerName = "Ramesh Patel";
        int age = 62;
        int distanceKm = 340;
        double farePerKm = 1.45;          // money values use double, never int
        boolean seniorCitizen = true;

        System.out.println("Passenger name : " + passengerName);
        System.out.println("Age            : " + age);
        System.out.println("Distance (km)  : " + distanceKm);
        System.out.println("Fare per km    : ₹" + farePerKm);
        System.out.println("Senior citizen : " + seniorCitizen);	
	}

}
