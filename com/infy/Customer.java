package com.infy;

public class Customer {
    public String custId;
    public String custName;
    public Long custNo;
    public String custAdd;

    public void dispCustDetails() {
        System.out.println("Displaying Customer Details...");
        System.out.println("Customer ID " + custId);
        System.out.println("Customer Name " + custName);
        System.out.println("Customer Number " + custNo);
        System.out.println("Customer Address " + custAdd);
        System.out.println();

    }
}

class Tester {
    public static void main(String[] args) {
        Customer cust = new Customer();
        cust.custId = "C101";
        cust.custName = "Ajay Singh";
        cust.custNo = 1234567890L;
        cust.custAdd = "ABCD, XYZ";
        cust.dispCustDetails();

        Customer cust2 = new Customer();

        cust2.custId = "C102";
        cust2.custName = "Abhay Singh";
        cust2.custNo = 5698452316L;
        cust2.custAdd = "xyz, abc";

        cust2.dispCustDetails();
    }
}