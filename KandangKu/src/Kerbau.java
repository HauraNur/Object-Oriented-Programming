public class Kerbau extends Hewan {

  public Kerbau(String nama) {
    super(nama);
  }

  @Override
  public void suara() {
    System.out.println("Kerbau berbunyi: Moo...");
  }

  @Override
  public void bergerak() {
    System.out.println("Kerbau berjalan di sekitar kandang.");
  }

  // Method khusus Kerbau
  public void membajakSawah() {
    System.out.println("Kerbau digunakan untuk membajak sawah.");
  }
}