package Jobsheet9;
import java.util.Scanner;

public class SuratMain18 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      StackSurat18 stack = new StackSurat18(5); 

      int pilihan;
      do {
          System.out.println("\nMENU:");
          System.out.println("1. Terima Surat Izin");
          System.out.println("2. Proses Surat Izin");
          System.out.println("3. Lihat Surat Izin Terakhir");
          System.out.println("4. Cari Surat");
          System.out.println("0. Keluar");
          System.out.print("Pilih menu: ");
          pilihan = sc.nextInt();
          sc.nextLine(); 

          switch (pilihan) {
            case 1:
                System.out.print("ID Surat: ");
                String id = sc.nextLine();
                System.out.print("Nama Mahasiswa: ");
                String nama = sc.nextLine();
                System.out.print("Kelas: ");
                String kelas = sc.nextLine();
                System.out.print("Jenis Izin (S/I): ");
                char jenis = sc.nextLine().toUpperCase().charAt(0);
                System.out.print("Durasi Izin (hari): ");
                int durasi = sc.nextInt();
                sc.nextLine();

                Surat18 surat = new Surat18(id, nama, kelas, jenis, durasi);
                stack.push(surat);
                System.out.println("Surat berhasil ditambahkan");
                break;

            case 2:
                Surat18 suratDiproses = stack.pop();
                if (suratDiproses != null) {
                    System.out.println("Surat yang diproses:");
                    suratDiproses.tampilkanSurat();
                }
                break;

            case 3:
                Surat18 suratTerakhir = stack.peek();
                if (suratTerakhir != null) {
                    System.out.println("Surat terakhir yang masuk:");
                    suratTerakhir.tampilkanSurat();
                }
                break;

            case 4:
                System.out.print("Masukkan nama mahasiswa: ");
                String cariNama = sc.nextLine();
                stack.cariSurat(cariNama);
                break;

            case 0:
              System.out.println("Program selesai");
              break;

            default:
                System.out.println("Pilihan tidak valid");
          }
      } while (pilihan != 0);
  }
}