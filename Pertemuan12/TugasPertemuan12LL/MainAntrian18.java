package Pertemuan12.TugasPertemuan12LL;
import java.util.Scanner;

public class MainAntrian18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        QueueLinkedList18 antrian = new QueueLinkedList18();
        int pilihan;

        do {
            System.out.println("\n=== Sistem Antrian Layanan Kemahasiswaan ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Lihat Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Tampilkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc18.nextInt();
            sc18.nextLine();


            switch (pilihan) {
                case 1:
                        if (antrian.isFull()) {
                            System.out.println("Antrian sudah penuh!");
                        } else {
                            System.out.println("---Input Data Antrian Mahasiswa---");
                            System.out.print("Nama        : ");
                            String nama = sc18.nextLine();
                            System.out.print("NIM         : ");
                            String nim = sc18.nextLine();
                            System.out.print("Jurusan     : ");
                            String jurusan = sc18.nextLine();
                            System.out.print("Keperluan   : ");
                            String keperluan = sc18.nextLine();

                            MahasiswaAntrian18 mhs = new MahasiswaAntrian18(nim, nama, jurusan, keperluan);
                            antrian.enqueue(mhs);

                        }
                        break;
                case 2:
                        antrian.dequeue();
                        break;
                case 3:
                        antrian.peekFront();
                        break;
                case 4:
                        antrian.peekRear();
                        break;
                case 5:
                        System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getSize());
                        break;
                case 6:
                        System.out.println("Antrian " + (antrian.isEmpty() ? "kosong" : "tidak kosong"));
                        break;
                case 7:
                        System.out.println("Antrian " + (antrian.isFull() ? "penuh" : "tidak penuh"));
                        break;
                case 8:
                        antrian.clear();
                        break;
                case 9: 
                        antrian.print();
                        break;
                case 0:
                        System.out.println("Terima Kasih!");
                        break;
                default:
                System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}