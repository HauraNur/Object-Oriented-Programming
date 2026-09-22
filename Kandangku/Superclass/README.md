# Superclass pada Aplikasi Penjualan Peternakan Ruminansia

## Pengertian Superclass

Superclass adalah kelas utama yang menjadi dasar untuk kelas lain. Data atau method yang ada di superclass dapat digunakan oleh kelas yang mewarisinya.

Pada program ini, `Animal` digunakan sebagai superclass. `Animal` berisi bagian umum yang dimiliki oleh hewan, seperti nama hewan dan method untuk menampilkan informasi.

## Struktur Class

```text
Animal
├── Sapi
└── Kambing
```

`Animal` menjadi superclass, sedangkan `Sapi` dan `Kambing` menjadi subclass.

## Kode Superclass

```java
abstract class Animal {
    String nama;

    public Animal(String nama) {
        this.nama = nama;
    }

    public abstract void suara();

    public void info() {
        System.out.println("Nama hewan: " + nama);
    }
}
```

Pada class `Animal` terdapat variabel `nama` untuk menyimpan nama hewan.

Constructor:

```java
public Animal(String nama) {
    this.nama = nama;
}
```

digunakan untuk memberikan nama pada hewan saat objek dibuat.

Method:

```java
public void info() {
    System.out.println("Nama hewan: " + nama);
}
```

digunakan untuk menampilkan nama hewan.

Sedangkan:

```java
public abstract void suara();
```

merupakan method abstrak. Method ini belum memiliki isi dan nantinya akan dibuat oleh subclass.

## Class Sapi

```java
class Sapi extends Animal {

    public Sapi(String nama) {
        super(nama);
    }

    public void suara() {
        System.out.println("Sapi: Moo...");
    }
}
```

`Sapi` menggunakan `extends Animal`, yang berarti class `Sapi` mewarisi `Animal`.

`super(nama)` digunakan untuk memanggil constructor yang ada pada class `Animal`.

Class `Sapi` juga mengisi method `suara()` dengan suara sapi.

## Class Kambing

```java
class Kambing extends Animal {

    public Kambing(String nama) {
        super(nama);
    }

    public void suara() {
        System.out.println("Kambing: Mbeeek...");
    }
}
```

Sama seperti `Sapi`, class `Kambing` juga mewarisi `Animal`.

Perbedaannya ada pada isi method `suara()`, karena suara kambing berbeda dengan suara sapi.

## Cara Kerja Program

Contoh penggunaan pada `Main`:

```java
class Main {
    public static void main(String[] args) {
        Sapi sapi = new Sapi("Sapi Limousin");
        Kambing kambing = new Kambing("Kambing Etawa");

        sapi.info();
        sapi.suara();

        kambing.info();
        kambing.suara();
    }
}
```

Saat program dijalankan, objek `sapi` dan `kambing` dibuat terlebih dahulu.

Setelah itu, method `info()` dipanggil. Method tersebut berasal dari superclass `Animal`, tetapi dapat digunakan oleh `Sapi` dan `Kambing` karena keduanya mewarisi `Animal`.

Method `suara()` memiliki isi yang berbeda pada setiap subclass. `Sapi` menampilkan suara sapi, sedangkan `Kambing` menampilkan suara kambing.

## Kesimpulan

Superclass digunakan agar bagian yang sama pada beberapa class tidak perlu ditulis berulang kali. Pada program ini, `Animal` menjadi dasar untuk `Sapi` dan `Kambing`.

Konsep ini dapat digunakan pada aplikasi penjualan peternakan ruminansia karena ada beberapa jenis hewan yang memiliki data umum, tetapi juga memiliki ciri masing-masing.
