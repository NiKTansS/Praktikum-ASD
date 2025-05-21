package Pertemuan12.TugasPertemuan12LL;

public class QueueLinkedList18 {
    NodeAntrian18 front;
    NodeAntrian18 rear;
    int size;
    int maxSize = 50;

    public QueueLinkedList18() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() { // cek antrian kosong
        return front == null;
    }

    public boolean isFull() { //cek antrian penuh 
        return size >= maxSize;
    }

    public void enqueue(MahasiswaAntrian18 data) { // menambahkan antrian
        if (isFull()) {
            System.out.println("Antrian sudah penuh, tidak bisa menambahkan data baru!");
            return;
        }
        NodeAntrian18 newNode = new NodeAntrian18(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa atas nama " + data.nama + " telah ditambahkan ke antrian.");
    }

    public MahasiswaAntrian18 dequeue() { // memanggil antrian (dequeue)
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada data mahasiswa yang bisa dipanggil!");
            return null;
        }
        MahasiswaAntrian18 data = front.data;
        front= front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println("Mahasiswa " + data.nama + " telah dipanggil!");
        return data;
    }

    public void peekFront() { //menampilkan antrian terdepan
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada data mahasiswa yang bisa ditampilkan.");
        } else {
            System.out.println("Mahasiswa terdepan dalam antrian: ");
            front.data.tampilkanDataMahasiswa();
        }
    }

    public void peekRear() { // menampilkan antrian paling akhir
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada data mahasiswa yang bisa ditampilkan.");
        } else {
            System.out.println("Mahasiswa terakhir dalam antrian: ");
            rear.data.tampilkanDataMahasiswa();
        }
    }

    public void clear() { // mengosongkan antrian
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");

    }

    public void print() { // menampilan seluruh antrian
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        } else {
            System.out.println("Daftar Mahasiswa dalam Antrian");
            System.out.println("---------------------------------------------------------------");
            System.out.printf("%-15s %-20s %-15s %-20s\n", "Nama", "NIM", "Jurusan", "Keperluan");
            System.out.println("---------------------------------------------------------------");
            NodeAntrian18 temp = front;
            while (temp != null) {
                temp.data.tampilkanDataMahasiswa();
                temp = temp.next;
            }
        }
    }

    public int getSize() {
        return size;
    }
}
