package percobaan;

public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    public Pelanggan(String nama, Mobil mobil, Sopir sopir, int hari) {
        this.nama = nama;
        this.mobil = mobil;
        this.sopir = sopir;
        this.hari = hari;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }

    public Sopir getSopir() {
        return sopir;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public int getHari() {
        return hari;
    }

    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }

    public void info() {
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Merk Mobil : " + mobil.getNama());
        System.out.println("Nama Sopir : " + sopir.getNama());
        System.out.println("Total Biaya : " + hitungBiayaTotal());
    }
}
