package tugas;

public class Pemesanan {
    private Pengguna pengguna;
    private Film film;
    private Bioskop bioskop;
    private String nomorKursi;

    public Pemesanan(Film film, Pengguna pengguna, Bioskop bioskop, String nomorKursi) {
        this.film = film;
        this.pengguna = pengguna;
        this.bioskop = bioskop;
        this.nomorKursi = nomorKursi;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Film getFilm() {
        return film;
    }

    public void setPengguna() {
        this.pengguna = pengguna;
    }

    public Pengguna getPengguna() {
        return pengguna;
    }

    public void setBioskop(Bioskop bioskop) {
        this.bioskop = bioskop;
    }

    public Bioskop getBioskop() {
        return bioskop;
    }

    public void setNomorKursi(String nomorKursi) {
        this.nomorKursi = nomorKursi;
    }

    public String getNomorKursi() {
        return nomorKursi;
    }

    public String info() {
        String info = "";
        info += "Pemesanan oleh:\n" + pengguna.info();
        info += "Film yang dipesan:\n" + film.info();
        info += "Nomor Kursi: " + nomorKursi + "\n";
        info += "Bioskop: " + bioskop.getNama() + "\n";
        return info;
    }
}
