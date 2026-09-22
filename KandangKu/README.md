# project-akhir-versi-01

## SOAL TUGAS

Tugas kelompok deadline Senin depan pukul 23.59.

Buatlah contoh penerapan kelas abstract dan interface pada konteks objek data yang relevan dengan topik tugas projek kelompok kalian.

### Ketentuan:

1. Kelas abstract harus memiliki minimal 2 method abstract dan 1 method standard.

2. Ada minimal dua kelas yang meng-extends kelas abstract yang dibuat pada poin 1. Setiap kelas ini minimal telah memiliki 1 method khusus miliknya sendiri.

3. Buat dua buah interface dengan masing-masing minimal memiliki 2 method.

4. Buat masing-masing satu kelas yang mengimplementasikan interface 1 saja, interface 2 saja, dan keduanya.

Jadikan dalam 1 project, beri judul `project-akhir-versi-01`.

---

# PENERAPAN KELAS ABSTRACT DAN INTERFACE

## Deskripsi

Project ini dibuat untuk menerapkan penggunaan **kelas abstract** dan **interface** pada Java.

Tema yang digunakan adalah data hewan. Hewan yang digunakan dalam project ini adalah:

* Sapi
* Kambing
* Domba
* Kerbau

Setiap hewan memiliki sifat dan fungsi yang berbeda. Karena itu, project ini digunakan untuk menunjukkan bagaimana kelas abstract dan interface dapat digunakan dalam program.

---

## 1. Kelas Abstract

Kelas abstract yang digunakan adalah `Hewan`.

```java
public abstract class Hewan
```

Kelas `Hewan` menjadi dasar untuk beberapa kelas hewan lainnya.

Pada kelas ini terdapat 2 method abstract:

```java
public abstract void suara();

public abstract void bergerak();
```

Method `suara()` digunakan untuk menentukan suara dari setiap hewan.

Method `bergerak()` digunakan untuk menentukan cara bergerak setiap hewan.

Karena setiap hewan memiliki suara dan cara bergerak yang berbeda, isi kedua method tersebut dibuat pada kelas turunannya.

Selain itu, kelas `Hewan` juga memiliki 1 method standard:

```java
public void info() {
    System.out.println("Nama hewan: " + nama);
}
```

Method `info()` digunakan untuk menampilkan nama hewan.

Jadi, kelas `Hewan` sudah memenuhi ketentuan pertama karena memiliki:

* 2 method abstract
* 1 method standard

---

## 2. Kelas yang Meng-extends Kelas Abstract

Ada 4 kelas yang meng-extends `Hewan`, yaitu:

* `Sapi`
* `Kambing`
* `Domba`
* `Kerbau`

### Sapi

```java
public class Sapi extends Hewan implements DapatDijual
```

Sapi memiliki method khusus:

```java
public void menghasilkanSusu()
```

Method ini digunakan untuk menunjukkan bahwa sapi dapat menghasilkan susu.

### Kambing

```java
public class Kambing extends Hewan implements DapatDirawat
```

Kambing memiliki method khusus:

```java
public void memanjat()
```

Method ini digunakan untuk menunjukkan salah satu kemampuan khusus kambing.

### Domba

```java
public class Domba extends Hewan implements DapatDijual, DapatDirawat
```

Domba memiliki method khusus:

```java
public void menghasilkanWol()
```

Method ini digunakan untuk menunjukkan bahwa domba dapat menghasilkan wol.

### Kerbau

```java
public class Kerbau extends Hewan
```

Kerbau memiliki method khusus:

```java
public void membajakSawah()
```

Method ini digunakan untuk menunjukkan bahwa kerbau dapat digunakan untuk membajak sawah.

Selain method khusus tersebut, semua kelas hewan juga memiliki `suara()` dan `bergerak()` karena berasal dari kelas `Hewan`.

Dengan demikian, ketentuan kedua sudah terpenuhi.

---

## 3. Interface

Pada project ini terdapat 2 interface, yaitu:

* `DapatDijual`
* `DapatDirawat`

### Interface `DapatDijual`

```java
public interface DapatDijual
```

Interface ini memiliki 2 method:

```java
void tampilkanHarga();

void jual();
```

`DapatDijual` digunakan untuk hewan yang dapat dijual.

Method `tampilkanHarga()` digunakan untuk menampilkan harga hewan.

Method `jual()` digunakan untuk menunjukkan proses penjualan hewan.

---

### Interface `DapatDirawat`

```java
public interface DapatDirawat
```

Interface ini memiliki 2 method:

```java
void beriMakan();

void periksaKesehatan();
```

`DapatDirawat` digunakan untuk hewan yang perlu dirawat.

Method `beriMakan()` digunakan untuk memberikan makanan kepada hewan.

Method `periksaKesehatan()` digunakan untuk melakukan pemeriksaan kesehatan hewan.

Jadi, ketentuan ketiga sudah terpenuhi karena terdapat 2 interface dan masing-masing memiliki 2 method.

---

## 4. Penggunaan Interface pada Kelas

Pada project ini, setiap interface digunakan oleh kelas yang berbeda.

### Sapi Menggunakan Interface 1 Saja

Sapi menggunakan `DapatDijual`.

```java
public class Sapi extends Hewan implements DapatDijual
```

Artinya, Sapi hanya menggunakan interface `DapatDijual`.

Sapi memiliki method:

```java
tampilkanHarga()
jual()
```

---

### Kambing Menggunakan Interface 2 Saja

Kambing menggunakan `DapatDirawat`.

```java
public class Kambing extends Hewan implements DapatDirawat
```

Artinya, Kambing hanya menggunakan interface `DapatDirawat`.

Kambing memiliki method:

```java
beriMakan()
periksaKesehatan()
```

---

### Domba Menggunakan Kedua Interface

Domba menggunakan kedua interface:

```java
public class Domba extends Hewan implements DapatDijual, DapatDirawat
```

Artinya, Domba menggunakan `DapatDijual` dan `DapatDirawat` sekaligus.

Karena menggunakan kedua interface tersebut, Domba memiliki method:

```java
tampilkanHarga()
jual()
beriMakan()
periksaKesehatan()
```

Dengan demikian, ketentuan keempat sudah terpenuhi karena terdapat:

* Sapi yang menggunakan interface 1 saja
* Kambing yang menggunakan interface 2 saja
* Domba yang menggunakan kedua interface

---

## 5. Class `Main`

Class `Main` digunakan untuk menjalankan program.

Di dalam `Main`, dibuat objek dari setiap kelas hewan:

```java
Sapi sapi = new Sapi("Sapi Limousin");
Kambing kambing = new Kambing("Kambing Etawa");
Domba domba = new Domba("Domba Garut");
Kerbau kerbau = new Kerbau("Kerbau Lokal");
```

Setelah objek dibuat, method dari setiap objek dipanggil.

Contohnya pada objek Domba:

```java
domba.info();
domba.suara();
domba.bergerak();
domba.menghasilkanWol();
domba.tampilkanHarga();
domba.jual();
domba.beriMakan();
domba.periksaKesehatan();
```

Kode tersebut menjalankan method yang berasal dari:

* kelas abstract `Hewan`
* kelas `Domba`
* interface `DapatDijual`
* interface `DapatDirawat`

---

## 6. Struktur Project

```text
project-akhir-versi-01/
│
├── src/
│   ├── DapatDijual.java
│   ├── DapatDirawat.java
│   ├── Domba.java
│   ├── Hewan.java
│   ├── Kambing.java
│   ├── Kerbau.java
│   ├── Main.java
│   └── Sapi.java
│
├── bin/
├── lib/
├── .vscode/
└── README.md
```

---

## 7. Kesimpulan

Project ini menggunakan kelas abstract dan interface dengan tema data hewan.

Kelas `Hewan` digunakan sebagai kelas dasar untuk `Sapi`, `Kambing`, `Domba`, dan `Kerbau`. Kelas tersebut memiliki 2 method abstract dan 1 method standard.

Selain itu, terdapat 2 interface, yaitu `DapatDijual` dan `DapatDirawat`. Sapi menggunakan interface `DapatDijual`, Kambing menggunakan `DapatDirawat`, sedangkan Domba menggunakan kedua interface tersebut.

Dengan penerapan tersebut, semua ketentuan yang diberikan pada tugas sudah diterapkan dalam satu project.
