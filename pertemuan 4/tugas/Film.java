package tugas;

public class Film {
    private String judul, genre;
    private int durasi;

    public Film(String judul, String genre, int durasi) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public String info() {
        String info = "";
        info += "Judul Film : " + judul + "\n";
        info += "Genre Film : " + genre + "\n";
        info += "Durasi Film : " + durasi + "\n";
        return info;
    }
}
