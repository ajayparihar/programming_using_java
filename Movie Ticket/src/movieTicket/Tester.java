package movieTicket;

class MovieTicket {
    private int movId;
    private int noOfSeats;
    private int cost;

    public int getCost() {
	return cost;
    }

    public void setCost(int cost) {
	this.cost = cost;
    }

    MovieTicket(int movId, int seats) {
	this.movId = movId;
	this.noOfSeats = seats;
    }

    int calculateTotalAmount() {
	return this.noOfSeats * this.cost;
    }

    public int getMovId() {
	return movId;
    }

    public void setMovId(int movId) {
	this.movId = movId;
    }

    public int getNoOfSeats() {
	return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
	this.noOfSeats = noOfSeats;
    }

}

class Tester {
    public static void main(String[] args) {
	MovieTicket movieTicket = new MovieTicket(112, 3);
	movieTicket.setCost(25);
	double amount = movieTicket.calculateTotalAmount();
	if (amount == 0)
	    System.out.println("Sorry! Please enter valid movie Id and number of seats");
	else
	    System.out.println("Total amount for booking : $" + amount);
    }
}