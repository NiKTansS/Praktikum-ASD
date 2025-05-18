package Pertemuan12;
import java.util.Scanner;

public class SLLMain18 {
  public static void main(String[] args) {
    Scanner sc18 = new Scanner(System.in);
    SingleLinkedList18 sll = new SingleLinkedList18();

    System.out.print("Masukkan jumlah Mahasiswa: ");
    int jumlah = sc18.nextInt();
    sc18.nextLine();

    for(int i = 0; i < jumlah; i++){
      System.out.println("Data Mahasiswa ke-" + (i + 1));
      System.out.print("Nama    :");
      String nama = sc18.nextLine();
      System.out.print("NIM     :");
      String nim = sc18.nextLine();
      System.out.print("Kelas   :");
      String kelas =sc18.nextLine();
      System.out.print("IPK     :");
      double ipk = sc18.nextDouble();
      sc18.nextLine();


      Mahasiswa18 mhs = new Mahasiswa18(nim, nama, kelas, ipk);
      sll.addLast(mhs);
    }

    sll.print();
  }
}
