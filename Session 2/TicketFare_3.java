
public class TicketFare_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String passengerName = "Ramesh Patel";
		int age = 62;
		int distanceKm = 340;
		double farePerKm = 1.45;
		boolean seniorCitizen = true;
		
		double reservationCharge = 40.0;
		double baseFare = distanceKm * farePerKm;
		
		boolean eligible = age>= 60 && seniorCitizen;
		double concession = eligible ? baseFare * 0.40 : 0.0;
		double discountedBase = baseFare - concession;
		
		
		double superFastCharge = distanceKm > 300 ? 30.0 : 0.0;
		double subTotal = discountedBase  + reservationCharge + superFastCharge;
		double gst = subTotal * 0.05;
		double totalFare = subTotal +gst;
		
		System.out.println("Passenger name : " + passengerName);
        System.out.println("Age            : " + age);
        System.out.println("Distance (km)  : " + distanceKm);
        System.out.println("Fare per km    : ₹" + farePerKm);
        System.out.println("Senior citizen : " + seniorCitizen);
        System.out.println("Eligible       : " + eligible);
        System.out.println();
        System.out.println("Base fare         : ₹" + baseFare);
        System.out.println("Senior concession : ₹" + concession);
        System.out.println("Reservation charge: ₹" + reservationCharge);
        System.out.println("Superfast charge  : ₹" + superFastCharge);
        System.out.println("GST (5%)          : ₹" + gst);
        System.out.println("Total fare        : ₹" + totalFare);
		
	}

}
