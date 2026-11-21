
public class MenuBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String border = "==============================";   // 30 '=' characters
		
		//Header
		 System.out.println(border);
	     System.out.println("   Sunrise Campus Canteen");
	     System.out.println(border);
	    
	  // Menu items (item <tab> price)
		System.out.println("Masala Dosa\t₹60");
        System.out.println("Veg Sandwich\t₹40");
        System.out.println("Samosa (2 pcs)\t₹20");
        System.out.println("Chole Bhature\t₹90");
        System.out.println("Masala Chai\t₹10");
        
     // Footer: blank line made with \n, then three lines
        System.out.println("\nJava version: "+ System.getProperty("java.version"));
        System.out.println("Operating System: "+ System.getProperty("os.name"));
        System.out.println("Java first released in 1996 by Sun Microsystems");
	}

}
