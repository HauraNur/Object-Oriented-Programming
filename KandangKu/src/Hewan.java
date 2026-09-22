public abstract class Hewan {
  protected String nama;

  public Hewan(String nama) {
    this.nama = nama;
  }

  // Abstract method 1
  public abstract void suara();

  // Abstract method 2
  public abstract void bergerak();

  // Standard method
  public void info() {
    System.out.println("Nama hewan: " + nama);
  }
}