package tugas;

import java.util.BitSet;

public class Bioskop {
    private String nama, alamat;
    private Film filmTersedia[];

    public Bioskop(String nama, String alamat, int jumlahFilm) {
        this.nama = nama;
        this.alamat = alamat;
        this.filmTersedia = new Film[jumlahFilm + 1];
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setFilmTersedia(Film film, int index) {
        if (index >= 0 && index <= filmTersedia.length - 1) {
            this.filmTersedia[index] = film;
        } else {
            System.out.println("Indeks tidak valid");
        }
    }

    public void tampilkanFilmTersedia() {
        for (int i = 0; i < filmTersedia.length; i++) {
            Film film = filmTersedia[i];
            if (film != null) {
                System.out.println(i + ". " + film.getJudul());
            }
        }
    }

    public Film getFilmTersedia(int index) {
        if (index >= 0 && index < filmTersedia.length) {
            return filmTersedia[index];
        } else {
            return null;
        }
    }

    public String info() {
        String info = "";
        info += "Nama Bioskop: " + nama + "\n";
        info += "Alamat: " + alamat + "\n";
        info += "Film Tersedia:\n";
        for (Film film : filmTersedia) {
            if (film != null) {
                info += "- " + film.info() + "\n";
            }
        }
        return info;
    }
}
