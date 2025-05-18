package Pertemuan12;

public class Mahasiswa18 {
  String nim;
  String nama;
  String kelas;
  double ipk;

  public Mahasiswa18(String nim, String nama, String kelas, double ipk) {
    this.nim = nim;
    this.nama = nama;
    this.kelas = kelas;
    this.ipk = ipk;
  }
  public void tampilInformasi() {
    System.out.printf("%-15s %-20s %-10s %.1f\n", nama, nim, kelas, ipk);
  } 
}
