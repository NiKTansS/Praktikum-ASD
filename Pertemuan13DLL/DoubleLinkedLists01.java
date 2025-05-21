package Pertemuan13DLL;

public class DoubleLinkedLists01 {
  Node01 head;
  Node01 tail;

  public DoubleLinkedLists01() {
    head = null;
    tail = null;
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
}
