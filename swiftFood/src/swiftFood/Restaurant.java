package swiftFood;

public class Restaurant {

    String restName;
    Long restContact;
    String restAddress;
    float rating;

    public Restaurant(String name, long restContract, String restAddress, float rating) {
	System.out.println("Restaurant Details");
	System.out.println("********************");
	System.out.println("Restaurant Name: " + name);
	System.out.println("Restaurant Rating: " + rating);
	System.out.println("Restaurant Contact: " + restContact);
	System.out.println("Restaurant Address: " + restAddress);

	System.out.println("\n");

    }

    public void displayRestDetails() {

	System.out.println("Restaurant Details");
	System.out.println("********************");
	System.out.println("Restaurant Name: " + restName);
	System.out.println("Restaurant Rating: " + rating);
	System.out.println("Restaurant Contact: " + restContact);
	System.out.println("Restaurant Address: " + restAddress);

	System.out.println("\n");
    }

}
