public class Sapi extends Hewan implements DapatDijual {

  public Sapi(String nama) {
    super(nama);
  }

  @Override
  public void suara() {
    System.out.println("Sapi berbunyi: Moo moo...");
  }

  @Override
  public void bergerak() {
    System.out.println("Sapi berjalan di sekitar kandang.");
  }

  // Method khusus Sapi
  public void menghasilkanSusu() {
    System.out.println("Sapi menghasilkan susu.");
  }

  @Override
  public void tampilkanHarga() {
    System.out.println("Harga sapi: Rp20.000.000");
  }

  @Override
  public void jual() {
    System.out.println("Sapi dijual.");
  }
}