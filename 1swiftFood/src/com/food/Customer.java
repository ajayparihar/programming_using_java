package com.food;

class Customer {
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
