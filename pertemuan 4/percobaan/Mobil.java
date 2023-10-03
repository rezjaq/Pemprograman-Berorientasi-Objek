package percobaan;

public class Mobil {
    private String nama;
    private int biaya;

    public Mobil(String nama, int biaya) {
        this.nama = nama;
        this.biaya = biaya;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getBiaya() {
        return biaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }

}
