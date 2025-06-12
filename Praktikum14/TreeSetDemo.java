package Praktikum14;
import java.util.TreeSet;

public class TreeSetDemo {
  public static void main(String[] args) {
    TreeSet<String> fruits = new TreeSet<>();

    fruits.add("Mangga");
    fruits.add("Apel");
    fruits.add("Jeruk");
    fruits.add("Jambu");

    for (String temp : fruits) {
      System.out.println(temp);
    }
  }
}
