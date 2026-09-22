public class Kambing extends Hewan implements DapatDirawat {

  public Kambing(String nama) {
    super(nama);
  }

  @Override
  public void suara() {
    System.out.println("Kambing berbunyi: Mbeeek...");
  }

  @Override
  public void bergerak() {
    System.out.println("Kambing berjalan dan melompat.");
  }

  // Method khusus Kambing
  public void memanjat() {
    System.out.println("Kambing sedang memanjat.");
  }

  @Override
  public void beriMakan() {
    System.out.println("Kambing diberi makan rumput.");
  }

  @Override
  public void periksaKesehatan() {
    System.out.println("Kesehatan kambing diperiksa.");
  }
}