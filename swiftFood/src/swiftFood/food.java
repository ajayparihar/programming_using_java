package swiftFood;

class food {
    private String foodName;
    private String cuisine;
    private String foodType;
    private int quantityAvailable;
    private double unitPrice;

    public void dispfoodDetails() {
	System.out.println("Displaying Food Details...");
	System.out.println("Food Name:- " + getFoodName());
	System.out.println("Cuisine:- " + getCuisine());
	System.out.println("Food Type:- " + getFoodType());
	System.out.println("Quantity Available:- " + getQuantityAvailable());
	System.out.println("Unit Price:- " + getUnitPrice());
	System.out.println();

    }

    public String getFoodName() {
	return foodName;
    }

    public void setFoodName(String foodName) {
	this.foodName = foodName;
    }

    public String getCuisine() {
	return cuisine;
    }

    public void setCuisine(String cuisine) {
	this.cuisine = cuisine;
    }

    public String getFoodType() {
	return foodType;
    }

    public void setFoodType(String foodType) {
	this.foodType = foodType;
    }

    public int getQuantityAvailable() {
	return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
	this.quantityAvailable = quantityAvailable;
    }

    public double getUnitPrice() {
	return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
    }
}
