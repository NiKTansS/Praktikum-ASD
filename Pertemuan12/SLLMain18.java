package Pertemuan12;

public class SLLMain18 {
  public static void main(String[] args) {
    SingleLinkedList18 sll = new SingleLinkedList18();

    Mahasiswa18 mhs1 = new Mahasiswa18("22212202", "Cintia", "3C", 3.5);
    Mahasiswa18 mhs2 = new Mahasiswa18("23212201", "Bimon", "2B", 3.8);
    Mahasiswa18 mhs3 = new Mahasiswa18("24212200", "Alvaro", "1A", 4.0);
    Mahasiswa18 mhs4 = new Mahasiswa18("21212203", "Dirga", "4D", 3.6);


    // Tambah data dulu biar bisa diakses
    sll.addFirst(mhs4);
    sll.addLast(mhs1);
    sll.addLast(mhs2);
    sll.addLast(mhs3);

     // Akses data index ke-1
    System.out.println("data index 1 : ");
    sll.getData(1); // Cintia

    // Cari index berdasarkan nama
    System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
    System.out.println();

    // Hapus first dan last
    sll.removeFirst(); // hapus Dirga
    sll.removeLast();  // hapus Alvaro
    sll.print();       // tersisa: Cintia, Bimon

    // Hapus index ke-0 (Cintia)
    sll.removeAt(0);
    sll.print();       // tersisa: Bimon
  }
}