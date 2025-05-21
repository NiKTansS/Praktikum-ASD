package Pertemuan13DLL;

public class DoubleLinkedLists01 {
  Node01 head;
  Node01 tail;
  int size;

  public DoubleLinkedLists01() {
    head = null;
    tail = null;
    size = 0;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public void addFirst(Mahasiswa01 data) {
    Node01 newNode = new Node01(data);
    if (isEmpty()) {
      head = tail = newNode;
    } else {
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    }
    size++;
  }

  public void addLast(Mahasiswa01 data) {
    Node01 newNode = new Node01(data);
    if (isEmpty()) {
      head = tail = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
    size++;
  }

  public void add(Mahasiswa01 data, int index) { // jawaban tugas no 1
    if (index < 0 || index > size) {
      System.out.println("Indeks di luar jangkauan.");
      return;
    }
    if (index == 0) {
      addFirst(data);
    } else if (index == size) {
      addLast(data);
    } else {
      Node01 newNode = new Node01(data);
      Node01 current = head;
      for (int i = 0; i < index -1; i++) {
        current = current.next;
      }
      newNode.next = current.next;
      newNode.prev = current;
      current.next.prev = newNode;
      current.next = newNode;
      size++;
    }
  }

  public void insertAfter(String keyNim, Mahasiswa01 data) {
    Node01 current = head;

    // cari node dengan nim = keyNim
    while (current != null && !current.data.nim.equals(keyNim)) {
      current = current.next;
    }
    if (current == null) {
      System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
      return;
    }

    Node01 newNode = new Node01(data);

    // jika current adalah tail, cukup tambahkan di akhir
    if (current == tail) {
      current.next = newNode;
      newNode.prev = current;
      tail = newNode;
    } else {
      // sisipkan di tengah
      newNode.next = current.next;
      newNode.prev = current;
      current.next.prev = newNode;
      current.next = newNode;
    }
    size++;
    System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
  }

  public void print() {
    if (isEmpty()) {
      System.out.println("Linked List kosong.");
      return;
    }
    Node01 current = head;
    while (current != null) {
      current.data.tampil();
      current = current.next;
    }
  }

  public void getFirst() { // jawaban tugas no 4
    if (isEmpty()) {
      System.out.println("List kosong");
    } else {
      System.out.println("Data pertama:");
      head.data.tampil();
    }
  }

  public void getLast() { // jawaban tugas no 4
    if (isEmpty()) {
      System.out.println("List kosong");
    } else {
      System.out.println("Data Terakhir:");
      tail.data.tampil();
    }
  }

  public void getIndex(int index) { // jawaban tugas no 4
    if (index < 0 || index >= size) {
      System.out.println("Indeks tidak valid.");
      return;
    }
    Node01 current = head;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }
    System.out.println("Data pada indeks " + index + ": ");
    current.data.tampil();
  }

  public void removeFirst() {
    if (isEmpty()) {
      System.out.println("list kosong, tidak bisa dihapus.");
      return;
    }

    Mahasiswa01 removeData = head.data;

    if (head == tail) {
      head = tail = null;
    } else {
      head = head.next;
      head.prev = null;
    }
    System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
    removeData.tampil();
  }

  public void removeLast() {
    if (isEmpty()) {
      System.out.println("List kosong, tidak bisa dihapus.");
      return;
    }

    Mahasiswa01 removeData = tail.data;

    if (head == tail) {
      head = tail = null;
    } else {
      tail = tail.prev;
      tail.next = null;
    }
    System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
    removeData.tampil();
  }

  public void removeAfter(String keyNim) {  // jawaban tugas no 2
    Node01 current = head;
    while (current != null && !current.data.nim.equals(keyNim)) {
      current = current.next;
    }
    if (current == null || current.next == null) {
      System.out.println("Tidak bisa menghapus setelah NIM: " + keyNim);
      return;
    }
    Node01 removed = current.next;
    if (removed == tail) {
      tail = current;
      current.next = null;
    } else {
      current.next = removed.next;
      removed.next.prev = current;
    }
    size--;
    System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus:");
    removed.data.tampil();
  }

  public void remove(int index) { // jawaban tugas no 3
    if (index < 0 || index >= size) {
      System.out.println("Indeks tidak valid.");
      return;
    }
    if (index == 0) {
      removeFirst();
    } else if (index == size -1) {
      removeLast();
    } else {
      Node01 current = head;
      for (int i = 0; i < index; i++) {
        current = current.next;
      }
      current.prev.next = current.next;
      current.next.prev = current.prev;
      System.out.println("Data berhasil dihapus pada indeks " + index);
      current.data.tampil();
      size--;
    }
  }

  public Node01 search(String nim) {
    Node01 current = head;
    while (current != null) {
      if (current.data.nim.equals(nim)) {
        return current;
      }
      current = current.next;
    }
    return null;
  }

  public int getSize() { // jawaban tugas no 5
    return size;
  }
}
