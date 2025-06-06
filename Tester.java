class Customer{
    public String customerId;
    public String customerName;
    public long contactNumber;
    public String address;
    public void displayCustomerDetails(){
    System.out.println(customerId);
    System.out.println(customerName);
    System.out.println(contactNumber);
    System.out.println(address);
    }
}
class Tester{
public static void main(String[]args){
Customer customer =new Customer();
customer.customerId="C101";
customer.customerName="stephen";
customer.contactNumber=8838909993L;
customer.address="pillayar st";
customer.displayCustomerDetails();
}


}
