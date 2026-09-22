class Main {
  public static void main(String[] args) {
    Sapi sapi = new Sapi("Sapi Limousin");
    Kambing kambing = new Kambing("Kambing Etawa");

    sapi.info();
    sapi.jenisHewan();

    kambing.info();
    kambing.jenisHewan();
  }
}