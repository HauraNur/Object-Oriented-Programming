public class Buku {
    private String kode;
    private String judul;
    private GenreBuku genre;

    public Buku(String kode, String judul, GenreBBuku genre) {
        this.kode = kode;
        this.judul = judul;
        this.genre = genre;
        genre.tambahBuku(this);
    }
    public String getKode() {
        return kode;
    }
    public String getJudul() {
        return judul;
    }
    public GenreBuku getGenre() {
        return genre;
    }
}
