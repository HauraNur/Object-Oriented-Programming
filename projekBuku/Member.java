import java.util.List;
import java.util.ArrayList;

public class Member {
    private String idMember;
    private String nama;
    private List<Buku> daftarBuku;

    public Member(String idMember, String nama) {
        this.idMember = idMember;
        this.nama = nama;
        this.daftarBuku = new ArrayList<>();
    }

    public void pinjamBuku(Buku buku) {
        if (!daftarBuku.contains(buku)) {
            daftarBuku.add(buku);
        }
    }

    public String getIdMember() {
        return idMember;
    }

    public String getNama() {
        return nama;
    }

    public void tampilkanBuku() {
        System.out.println("Buku yang dipinjam " + nama + ":");

        for (Buku buku : daftarBuku) {
            System.out.println("- " + buku.getKode() + " (" + buku.getJudul() + ")");
        }
    }
}
