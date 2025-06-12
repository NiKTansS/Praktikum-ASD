package Praktikum14;
import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {
  public static void main(String[] args) {
    ArrayList<String> daftarSiswa = new ArrayList<>();
    daftarSiswa.add("Zainab");
    daftarSiswa.add("Andi");
    daftarSiswa.add("Rara");
    Collections.sort(daftarSiswa);

    System.out.println(daftarSiswa);

    ArrayList<Customer> customers = new ArrayList<>();
    customers.add(new Customer(1, "Zainab"));
    customers.add(new Customer(2, "Andi"));
    customers.add(new Customer(3, "Rara"));

    customers.sort((c1, c2) -> c1.name.compareTo(c2.name)); //sorting berdasarkan nama (ASC)

    System.out.println(customers);
  }
}
