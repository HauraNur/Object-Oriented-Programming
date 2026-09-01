public class Main {

    public static void main(String[] args) {

        Member m01 = new Member("M001", "Budi");
        Member m02 = new Member("M002", "Santi");

        GenreBuku g01 = new GenreBuku("Fiksi");
        GenreBuku g02 = new GenreBuku("Teknologi");

        Buku b01 = new Buku("B001", "Laskar Pelangi", g01);
        Buku b02 = new Buku("B002", "Bumi", g01);
        Buku b03 = new Buku("B003", "Pemrograman Java", g02);

        System.out.println("Nama Member: " + m01.getNama());

        m01.pinjamBuku(b01);
        m01.pinjamBuku(b03);

        m02.pinjamBuku(b02);

        System.out.println();

        m01.tampilkanBuku();

        System.out.println();

        m02.tampilkanBuku();

        System.out.println();

        g01.tampilkanBuku();

        System.out.println();

        g02.tampilkanBuku();
    }
}