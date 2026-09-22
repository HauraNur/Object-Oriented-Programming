public class Domba extends Hewan implements DapatDijual, DapatDirawat {

  public Domba(String nama) {
    super(nama);
  }

  @Override
  public void suara() {
    System.out.println("Domba berbunyi: Mbeeek...");
  }

  @Override
  public void bergerak() {
    System.out.println("Domba berjalan di sekitar kandang.");
  }

  // Method khusus Domba
  public void menghasilkanWol() {
    System.out.println("Domba menghasilkan wol.");
  }

  @Override
  public void tampilkanHarga() {
    System.out.println("Harga domba: Rp3.000.000");
  }

  @Override
  public void jual() {
    System.out.println("Domba dijual.");
  }

  @Override
  public void beriMakan() {
    System.out.println("Domba diberi makan rumput.");
  }

  @Override
  public void periksaKesehatan() {
    System.out.println("Kesehatan domba diperiksa.");
  }
}