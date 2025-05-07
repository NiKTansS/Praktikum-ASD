package TugasJobsheet10;


public class AntrianKRS18 {
  Mahasiswa18[] data;
  int front;
  int rear;
  int size;
  int max;
  int totalProses;

public AntrianKRS18(int max) {
  this.max = max;
  this.data = new Mahasiswa18[max];
  this.front = 0;
  this.rear = -1;
  this.size = 0;
}

public boolean isEmpty() { //cek antrian kosong
  if (size == 0) {
    return true;
  } else {
    return false;
  }
}

public boolean isFull() { //cek antrian penuh
  if (size ==  max) {
    return true;
  } else {
    return false;
  }
}

public void clear() { // mengosongkan antrian
  if (!isEmpty()) {
    front = rear = -1;
    size = 0;
    System.out.println("Queue berhasil dikosongkan");
  } else {
    System.out.println("Queue masih kosong");
  }
}

public void tambahAntrian(Mahasiswa18 mhs) { //menambahkan antrian (enqueue)
  if (isFull()) {
    System.out.println("Antrian penuh! Maksimal 10 mahasiswa.");
    return;
  }
  rear = (rear + 1) % max;
  data[rear] = mhs;
  size++;
  System.out.println(mhs.nama + " berhasil ditambahkan ke antrian.");  
}

public void prosesKRS() { //memanggil antrian untuk proses KRS (setiap 2 mahasiswa)
  if (isEmpty()) {
    System.out.println("Antrian kosong, tidak ada mahasiswa untuk diproses.");
    return;
  }
  if (totalProses >= 30) {
    System.out.println("Sudah 30 mahasiswa di proses. Tidak bisa memproses lagi");
    return;
  }
  System.out.println("Memproses KRS untuk 2 mahasiswa terdepan: ");
  //proses mahasiswa pertama
  Mahasiswa18 mhs1 =  data[front];
  System.out.print("1. ");
  mhs1.tampilkanData();
  front = (front + 1) % max;
  size--;
  totalProses++;

  //proses mahasiswa kedua jika ada
  if(!isEmpty()) {
    Mahasiswa18 mhs2 = data[front];
    System.out.print("2. ");
    mhs2.tampilkanData();
    front = (front + 1) % max;
    size--;
    totalProses++;
  } else {
    System.out.println("Hanya ada 1 mahasiswa dalam antrian.");
  }
}

public void tampilkanSemua() { //menampilkan semua antrian
  if (isEmpty()) {
      System.out.println("Antrian kosong.");
      return;
  }
  System.out.println("Daftar Mahasiswa dalam Antrian: ");
  System.out.println("NIM - NAMA - PRODI - KELAS");
  for (int i = 0; i < size; i++) {
    int index = (front + i) % max;
    System.out.print((i +1) + ". ");
    data[index].tampilkanData();
  }
}

public void lihatDuaTerdepan() { //menampilkan 2 antrian terdepan
  if (isEmpty()) {
    System.out.println("Antrian kosong.");
    return;
  }
  System.out.println("Dua Mahasiswa terdepan dalam antrian: ");
  System.out.print("1. ");
  data[front].tampilkanData();

  if (size > 1) {
    int next = (front + 1) % max;
    System.out.println("2. ");
    data[next].tampilkanData();
  } else {
    System.out.println("Hanya ada satu mahasiswa dalam antrian.");
  }
}

public void lihatAkhir() { //menampilkan antrian paling akhir
  if (isEmpty()) {
    System.out.println("Antrian kosong.");
  } else {
    System.out.println("Mahasiswa paling belakang.");
    System.out.println("NIM - NAMA - PRODI - KELAS");
    data[rear].tampilkanData();
  }
}

public int getJumlahAntrian(){ //cetak jumlah antrian
  return size;
}

public int getTotalProses() { // cetak jumlah yang sudah melakukan proses KRS
  return totalProses;
}

public int getBelumProses() { //cetak jumlah mahasiswa yang belum proses krs (dari 30 mahasiswa per dpa)
  return 30 - totalProses;
}
}
