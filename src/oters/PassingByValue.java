package oters;

class Customer {
  private String name;

  public Customer(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

public class PassingByValue {

  public static void main(String[] args) {
    // local variable: customer into stack--> instance Customer in heap
    final Customer customer = new Customer("wang");
    // push customer variable into stack.
    System.out.println(customer.getName());

    // a new local variable cust: which takes a copy of 'customer'
    // so they both points to the same instance 'Customer'
    modifyCustomer(customer);
    System.out.println(customer.getName());

    // conclusion: passing instance by value(a copy of reference). passing variable by value(a copy
    // of value)
  }

  //
  public static void modifyCustomer(Customer cust) {
    cust.setName("ynz");
  }
}
