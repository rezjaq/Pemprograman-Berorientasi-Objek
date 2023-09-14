package tugas;

import percobaan.anggota;

public class Anggota {
    private String nama;
    private int nomorKtp, limitPeminjaman, jmlPeminjamaan;

    public Anggota(String nama, int nomorKtp, int limitPeminjaman, int jmlPeminjamaan) {
        this.nama = nama;
        this.nomorKtp = nomorKtp;
        this.limitPeminjaman = limitPeminjaman;
        this.jmlPeminjamaan = jmlPeminjamaan;
    }

}
