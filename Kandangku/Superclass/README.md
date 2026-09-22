# Penjelasan Program Inheritance Java

## 1. Superclass

Pada program ini, **`Hewan`** merupakan **superclass** atau kelas induk. Superclass digunakan untuk menyimpan atribut dan method yang dapat digunakan oleh kelas turunannya.

```java
class Hewan {

    String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public void info() {
        System.out.println("Nama hewan: " + nama);
    }
}
```

Pada class `Hewan` terdapat:

* `String nama` digunakan untuk menyimpan nama hewan.
* `Hewan(String nama)` merupakan constructor untuk mengisi nama hewan.
* `info()` digunakan untuk menampilkan nama hewan.

Class `Sapi` dan `Kambing` menggunakan `Hewan` sebagai superclass dengan keyword `extends`.

```java
class Sapi extends Hewan
```

```java
class Kambing extends Hewan
```

Artinya, `Sapi` dan `Kambing` merupakan turunan dari `Hewan`. Kedua class tersebut dapat menggunakan atribut dan method yang ada pada `Hewan`.

---

## 2. Class Sapi

```java
class Sapi extends Hewan {

    public Sapi(String nama) {
        super(nama);
    }

    public void jenisHewan() {
        System.out.println("Jenis: Sapi");
    }
}
```

Class `Sapi` memiliki constructor yang menerima nama hewan.

```java
super(nama);
```

`super()` digunakan untuk memanggil constructor dari superclass, yaitu `Hewan`.

Selain itu, class `Sapi` memiliki method `jenisHewan()` untuk menampilkan jenis hewan sebagai sapi.

---

## 3. Class Kambing

```java
class Kambing extends Hewan {

    public Kambing(String nama) {
        super(nama);
    }

    public void jenisHewan() {
        System.out.println("Jenis: Kambing");
    }
}
```

Class `Kambing` bekerja dengan cara yang sama seperti `Sapi`. Class ini juga mewarisi `Hewan` dan menggunakan `super(nama)` untuk mengisi nama pada superclass.

Perbedaannya terdapat pada method `jenisHewan()` yang menampilkan `"Jenis: Kambing"`.

---

## 4. Cara Kerja Program

Program dijalankan dari class `Main`.

```java
public class Main {
    public static void main(String[] args) {
        Sapi sapi = new Sapi("Sapi Limousin");
        Kambing kambing = new Kambing("Kambing Etawa");

        sapi.info();
        sapi.jenisHewan();

        kambing.info();
        kambing.jenisHewan();
    }
}
```

Urutan kerja program adalah sebagai berikut:

1. Program membuat objek `sapi` dari class `Sapi` dengan nama **Sapi Limousin**.
2. Constructor `Sapi` memanggil `super(nama)` untuk mengirim nama tersebut ke constructor `Hewan`.
3. Nama `"Sapi Limousin"` disimpan pada atribut `nama` milik `Hewan`.
4. `sapi.info()` dipanggil untuk menampilkan nama hewan.
5. `sapi.jenisHewan()` dipanggil untuk menampilkan jenis hewan.
6. Selanjutnya program membuat objek `kambing` dari class `Kambing` dengan nama **Kambing Etawa**.
7. Constructor `Kambing` juga memanggil `super(nama)` untuk mengisi nama pada `Hewan`.
8. `kambing.info()` menampilkan nama kambing.
9. `kambing.jenisHewan()` menampilkan jenis kambing.

## 5. Hasil Output

```text
Nama hewan: Sapi Limousin
Jenis: Sapi
Nama hewan: Kambing Etawa
Jenis: Kambing
```

## 6. Kesimpulan

Program ini menerapkan konsep **inheritance (pewarisan)** dalam Java. `Hewan` berperan sebagai superclass, sedangkan `Sapi` dan `Kambing` sebagai subclass.

Dengan inheritance, `Sapi` dan `Kambing` tidak perlu membuat ulang atribut `nama` dan method `info()` karena sudah diwariskan dari `Hewan`. Setiap subclass kemudian dapat memiliki method sendiri, seperti `jenisHewan()` untuk menunjukkan jenis hewan masing-masing.
