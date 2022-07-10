package swiftFood;

public class Order {
    int orderId;
    String orderedFood;
    double totalPrice;
    String status;

    public Order() {
	this.status="Ordered";
    }

    public Order(int orderId, String orderedFood) {
	this();
	this.status = "Ordered";
	this.orderId = orderId;
	this.orderedFood = orderedFood;

    }

    public void calculateTotalPrice(int unitPrice) {

	System.out.println("Order Details");
	System.out.println("Order ID: " + orderId);
	System.out.println("Ordered Food: " + orderedFood);
	System.out.println("Order Status: " + status);
	System.out.println("Total Price: " + ((unitPrice * 0.05) + unitPrice));

	System.out.println("\n");

    }

}
