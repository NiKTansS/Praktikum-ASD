package TugasJobsheet10;
import java.util.Scanner;

import TugasJobsheet10.Mahasiswa18;

public class PersetujuanKRSMain18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    AntrianKRS18 antrian = new AntrianKRS18(10);
    int pilihan;

    do {
        System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Proses KRS (2 Mahasiswa)");
        System.out.println("3. Lihat Semua Antrian");
        System.out.println("4. Lihat 2 Antrian Terdepan");
        System.out.println("5. Lihat Antrian Terakhir");
        System.out.println("6. Jumlah Antrian");
        System.out.println("7. Jumlah yang Sudah Diproses");
        System.out.println("8. Jumlah Belum Diproses");
        System.out.println("9. Kosongkan Antrian");
        System.out.println("0. Keluar");
        System.out.print("Pilih: ");
        pilihan = sc.nextInt();
        sc.nextLine();
        
        switch (pilihan) {
          case 1:
                System.out.print("NIM   : ");
                String nim = sc.nextLine();
                System.out.print("Nama  : ");
                String nama = sc.nextLine();
                System.out.print("Prodi : ");
                String prodi = sc.nextLine();
                System.out.print("Kelas : ");
                String kelas = sc.nextLine();
                Mahasiswa18 mhs = new Mahasiswa18(nim, nama, prodi, kelas);
                antrian.tambahAntrian(mhs);
                break;
          case 2:
                antrian.prosesKRS();
                break;
          case 3:
                antrian.tampilkanSemua();
                break;
          case 4:
                antrian.lihatDuaTerdepan();
                break;
          case 5:
                antrian.lihatAkhir();
                break;
          case 6:
                System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                break;
          case 7:
                System.out.println("Jumlah mahasiswa yang sudah diproses: " + antrian.getTotalProses());
                break;
          case 8:
                System.out.println( "Jumlah mahasiswa yang belum diproses: " + antrian.getBelumProses());
                break;
          case 9:
                antrian.clear();
                break;
          case 0:
                System.out.println("Terima Kasih.");
                break;
          default:
                System.out.println("Pilihan tidak valid.");

        }
    } while (pilihan != 0);
  }
  
}
