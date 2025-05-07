package Jobsheet9;

public class StackSurat18 {
  Surat18[] stack;
  int top;
  int size;

  public StackSurat18(int size) {
      this.size = size;
      stack = new Surat18[size];
      top = -1;
  }

  public boolean isFull() {
      return top == size - 1;
  }

  public boolean isEmpty() {
      return top == -1;
  }

  public void push(Surat18 s) {
      if (!isFull()) {
          stack[++top] = s;
      } else {
          System.out.println("Stack penuh! Tidak bisa menerima surat lagi");
      }
  }

  public Surat18 pop() {
      if (!isEmpty()) {
          return stack[top--];
      } else {
          System.out.println("Stack kosong! Tidak ada surat yang diproses");
          return null;
      }
  }

  public Surat18 peek() {
      if (!isEmpty()) {
          return stack[top];
      } else {
          System.out.println("Stack kosong! Tidak ada surat");
          return null;
      }
  }

  public void cariSurat(String nama) {
      boolean ditemukan = false;
      for (int i = 0; i <= top; i++) {
          if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
              System.out.println("Surat ditemukan:");
              stack[i].tampilkanSurat();
              ditemukan = true;
              break;
          }
      }
      if (!ditemukan) {
          System.out.println("Surat dari mahasiswa tersebut tidak ditemukan");
      }
  }
}
