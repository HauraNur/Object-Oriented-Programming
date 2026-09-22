public class Main {
  public static void main(String[] args) {

    Sapi sapi = new Sapi("Sapi Limousin");
    Kambing kambing = new Kambing("Kambing Etawa");
    Domba domba = new Domba("Domba Garut");
    Kerbau kerbau = new Kerbau("Kerbau Lokal");

    System.out.println("=== DATA SAPI ===");
    sapi.info();
    sapi.suara();
    sapi.bergerak();
    sapi.menghasilkanSusu();
    sapi.tampilkanHarga();
    sapi.jual();

    System.out.println();
    System.out.println("=== DATA KAMBING ===");
    kambing.info();
    kambing.suara();
    kambing.bergerak();
    kambing.memanjat();
    kambing.beriMakan();
    kambing.periksaKesehatan();

    System.out.println();
    System.out.println("=== DATA DOMBA ===");
    domba.info();
    domba.suara();
    domba.bergerak();
    domba.menghasilkanWol();
    domba.tampilkanHarga();
    domba.jual();
    domba.beriMakan();
    domba.periksaKesehatan();

    System.out.println();
    System.out.println("=== DATA KERBAU ===");
    kerbau.info();
    kerbau.suara();
    kerbau.bergerak();
    kerbau.membajakSawah();
  }
}