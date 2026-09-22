abstract class Hewan {
    String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public abstract void suara();

    public void info() {
        System.out.println("Nama hewan: " + nama);
    }
}