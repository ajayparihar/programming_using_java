package swiftFood;

public class Tester {
    public static void main(String[] args) {

	Customer cust = new Customer();
	cust.custId = "C101";
	cust.custName = "Ajay Singh";
	cust.custNo = 1234567890L;
	cust.custAdd = "ABCD, XYZ";
	cust.dispCustDetails();

	Order order1 = new Order();

	order1.orderId = 101;
	order1.orderedFood = "Spinach Alfredo Pasta";
	order1.totalPrice = 50;

	System.out.println("Status of Order 1: " + order1.status);

	order1.calculateTotalPrice((int) order1.totalPrice);

	Order order2 = new Order();

	order2.orderId = 1001;
	order2.orderedFood = "Garlic Shrimp";
	order2.totalPrice = 50;

	System.out.println("Status of Order 2: " + order2.status);
	System.out.println("Id of Order 2: " + order2.orderId);
	System.out.println("Items orderd in order 2: " + order2.orderedFood);

	Restaurant rest = new Restaurant("McDonald's", 9988787878L, "D089, St. Louis Street, Springfield",4.1F);

	rest.restName = "McDonald's";
	rest.rating = 4.1F;
	rest.restContact = 9988676767L;
	rest.restAddress = "SH1109, Carolina Street, Springfield";

	rest.displayRestDetails();

	Customer cust2 = new Customer();

	cust2.custId = "C102";
	cust2.custName = "Abhay Singh";
	cust2.custNo = 5698452316L;
	cust2.custAdd = "xyz, abc";

	cust2.dispCustDetails();

	food food1 = new food();

	food1.setFoodName("Samosa");
	food1.setCuisine("Indian");
	food1.setFoodType("fast Food");
	food1.setQuantityAvailable(5);
	food1.setUnitPrice(15);

	food1.dispfoodDetails();

	food food2 = new food();

	food2.setFoodName("Gobhi Manchurian");
	food2.setCuisine("Nepali");
	food2.setFoodType("fast Food");
	food2.setQuantityAvailable(10);
	food2.setUnitPrice(50);

	food2.dispfoodDetails();

    }
}