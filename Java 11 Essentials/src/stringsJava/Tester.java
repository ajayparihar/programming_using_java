package stringsJava;

import java.util.Scanner;

class Customer {
    private String customerName;
    private int applicableDiscount;

    public String getCustomerName() {
	return customerName;
    }

    public void setCustomerName(String customerName) {
	this.customerName = customerName;
    }

    public int getApplicableDiscount() {
	return applicableDiscount;
    }

    public void setApplicableDiscount(int applicableDiscount) {
	this.applicableDiscount = applicableDiscount;
    }

    public void findDiscountAndName(String inputString) {

	// write the solution as mentioned
    }
}

class Tester {
    public static void main(String[] args) {
	Customer customer1 = new Customer(); // regular
	Customer customer2 = new Customer(); // privileged

	// write the code to implement the solution
	Scanner scan = new Scanner(System.in);

    }
}