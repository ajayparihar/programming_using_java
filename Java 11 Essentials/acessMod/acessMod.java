package acessMod;

class Customer {
    public String customerId;
    public String customerName;
    public long contactNumber;
    public String address;
}

class AcessMod {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.customerId = "C101";
        customer.customerName = "Jack";
        customer.contactNumber = 9870345687L;
        customer.address = "D089, St. Louis Street, Springfield";
        System.out.println("Displaying customer details");
        System.out.println("Customer Id : " + customer.customerId);
        System.out.println("Customer Name : " + customer.customerName);
        System.out.println("Contact Number : " + customer.contactNumber);
        System.out.println("Address : " + customer.address);
    }
}