package Praktikum14;
import java.util.ArrayList;

public class DemoArrayList {
  public static void main(String[] args) {
    ArrayList<Customer> customers = new ArrayList<>();

    Customer customer1 = new Customer(1, "Zakia");
    Customer customer2 = new Customer(5, "Budi");

    customers.add(customer1);
    customers.add(customer2);
    customers.add(new Customer(4, "Cica"));
    customers.add(new Customer(100, "Rosa"));

    ArrayList<Customer> newCustomers = new ArrayList<>();
    newCustomers.add(new Customer(201, "Della"));
    newCustomers.add(new Customer(202, "Victor"));
    newCustomers.add(new Customer(203, "Sarah"));

    customers.addAll(newCustomers);

    System.out.println(customers);
  }
}

