package Pertemuan12;

public class SLLMain18 {
  public static void main(String[] args) {
    SingleLinkedList18 sll = new SingleLinkedList18();


    sll.print();

    Mahasiswa18 mhs1 = new Mahasiswa18("22212202", "Cintia", "3C", 3.5);
    Mahasiswa18 mhs2 = new Mahasiswa18("23212201", "Bimon", "2B", 3.8);
    Mahasiswa18 mhs3 = new Mahasiswa18("24212200", "Alvaro", "1A", 4.0);
    Mahasiswa18 mhs4 = new Mahasiswa18("21212203", "Dirga", "4D", 3.6);

    //addFirst Dirga
    sll.addFirst(mhs4);
    sll.print();

    sll.insertAfter("Dirga", mhs3);//insertAfter "Dirga" > Alvaro
    sll.print();
    
    sll.insertAfter("Dirga", mhs1); //Cintia setelah Dirga
    sll.insertAfter("Cintia", mhs2); //bimon setelah cintia

    sll.print();
  }
}
