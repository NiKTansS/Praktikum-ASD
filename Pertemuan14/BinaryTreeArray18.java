package Pertemuan14;

public class BinaryTreeArray18 {
  Mahasiswa18[] dataMahasiswa;
  int idxLast;

  public BinaryTreeArray18() {
    this.dataMahasiswa = new Mahasiswa18[10];
  }

  void populateData (Mahasiswa18 dataMhs[], int idxLast) {
    this.dataMahasiswa = dataMhs;
    this.idxLast = idxLast;
  }

  void traverseInOrder(int idxStart) {
    if(idxStart <= idxLast) {
      if (dataMahasiswa[idxStart] != null) {
        traverseInOrder(2*idxStart+1);
        dataMahasiswa[idxStart].tampilInformasi();
        traverseInOrder(2*idxStart+2);
      }
    }
  }
}
