package Pertemuan12;

public class SingleLinkedList18 {
  NodeMahasiswa18 head;
  NodeMahasiswa18 tail;

  boolean isEmpety() {
    return (head == null);
  }

  public void print() { //method untuk mencetak dengan menggunakan proses traverse
     if (!isEmpety()) {
      NodeMahasiswa18 tmp = head;
      System.out.println("Isi Linked List:\t");
      while (tmp != null) {
        tmp.data.tampilInformasi();
        tmp =  tmp.next;
      }
      System.out.println("");
     } else {
      System.out.println("Linked list kosong");
     }
  }
  
  public void addFirst(Mahasiswa18 input) {
    NodeMahasiswa18 ndInput = new NodeMahasiswa18(input, null);
    if (isEmpety()) {
      head = ndInput;
      tail = ndInput;
    } else {
      ndInput.next = head;
      head = ndInput;
    }
  }

  public void addLast(Mahasiswa18 input) {
    NodeMahasiswa18 ndInput = new NodeMahasiswa18(input, null);
    if (isEmpety()) {
      head = ndInput;
      tail = ndInput;
    } else {
      tail.next = ndInput;
      tail = ndInput;
    }
  }

  public void insertAfter(String key, Mahasiswa18 input) {
    NodeMahasiswa18 ndInput = new NodeMahasiswa18(input, null);
    NodeMahasiswa18 temp = head;
    do { 
        if (temp.data.nama.equalsIgnoreCase(key)) {
          ndInput.next = temp.next;
          temp.next = ndInput;
          if (ndInput.next == null) {
            tail = ndInput;
          }
          break;
        }
        temp = temp.next;
    } while (temp != null);
  }

  public void insertArt(int index, Mahasiswa18 input) {
    if (index < 0) {
      System.out.println("indeks salah");
    } else if (index == 0) {
      addFirst(input);
    } else {
      NodeMahasiswa18 temp = head;
      for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
      }
      temp.next = new NodeMahasiswa18(input, temp.next);
      if (temp.next.next == null) {
        tail = temp.next;
      }
    }
  }

  public void getData(int index) {
    NodeMahasiswa18 tmp = head;
    for (int i = 0; i < index; i++) {
      tmp = tmp.next;
    }
    tmp.data.tampilInformasi();
  }

  public int indexOf(String key) {
    NodeMahasiswa18 tmp = head;
    int index = 0;
    while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
      tmp = tmp.next;
      index++;
    }
    if (tmp == null) {
      return -1; 
    } else {
      return index;
    }
  }

  public void removeFirst() {
    if (isEmpety()) {
        System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
    } else if (head == tail) {
        head = tail = null;
    } else {
        head = head.next;
    }
  }
  
  public void removeLast() {
    if (isEmpety()) {
        System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
    } else if (head == tail) {
        head = tail = null;
    } else {
        NodeMahasiswa18 temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }
  }

  public void remove(String key) {
    if (isEmpety()) {
        System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
    } else {
        NodeMahasiswa18 temp = head;
        while (temp != null) {
            if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                this.removeFirst();
                break;
            } else if (temp.data.nama.equalsIgnoreCase(key)) {
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
                break;
            }
            temp = temp.next;
        }
    }
  }

  public void removeAt(int index) {
    if (index == 0) {
        removeFirst();
    } else {
        NodeMahasiswa18 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }
    }
  }
}
