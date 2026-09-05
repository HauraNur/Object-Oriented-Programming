import java.util.List;
import java.util.ArrayList;

public class GenreBuku{
  private String nama Genre;
  private List<Buku> daftarBuku;

  public GenreBuku(String namaGenre) {
    this.namaGenre = namaGenre;
    this.daftarBuku = new ArrayList<>();
  }

  public void tambahBuku(Buku buku) {
    if (!daftarBuku.contains(buku)) {
      daftarBuku.add(buku);
    }
  }
  public String getNamaGenre() {
    return namaGenre;
  }
  pubic void tampilkanBuku() {
    System.out.println("Buku genre " + namaGenre + ":");

    for (Buku buku : daftarBuku) {
      system.out.println("-" + buku.getKode() + " (" + buku.getJudul() + ")");
    }
  }
}
