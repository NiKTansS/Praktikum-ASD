package Pertemuan12.TugasPertemuan12LL;

public class MahasiswaAntrian18 {
  String nim, nama, jurusan, keperluan;

  public MahasiswaAntrian18(String nim, String nama, String jurusan, String keperluan){
    this.nim = nim;
    this.nama = nama;
    this.jurusan = jurusan;
    this.keperluan = keperluan;
  }

  public void tampilkanDataMahasiswa() {
    System.out.printf("%-15s %-20s %-15s %-20s\n", nama, nim, jurusan, keperluan);
  }
}
