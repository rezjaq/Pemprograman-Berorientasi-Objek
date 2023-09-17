package tugas;

public class Anggota {
    private String nama;
    private int nomorKtp, limitPeminjaman, jmlPeminjaman;

    public Anggota(String nama, int nomorKtp, int limitPeminjaman) {
        this.nama = nama;
        this.nomorKtp = nomorKtp;
        this.limitPeminjaman = limitPeminjaman;
        this.jmlPeminjaman = 0; // ini menandakan bahwa jumlah peminjaman masih nol
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLimitPinjaman() {
        return limitPeminjaman;
    }

    public void setLimitPinjaman(int limitPeminjaman) {
        this.limitPeminjaman = limitPeminjaman;
    }

    public int getJumlahPinjaman() {
        return jmlPeminjaman;
    }

    public void pinjam(int jmlPeminjaman) {
        if (jmlPeminjaman + this.jmlPeminjaman > this.limitPeminjaman) {
            System.out.println("Maaf, Jumlah peminjaman melebihi limit");
        } else {
            this.jmlPeminjaman += jmlPeminjaman; // Menambah jumlah pinjaman.
        }
    }

    public void angsur(int angsur) {
        int minimAngsur = (10 * this.jmlPeminjaman) / 100;
        if (angsur < minimAngsur) {
            System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman saat ini");
        } else {
            this.jmlPeminjaman -= angsur; // Mengurangkan jumlah pinjaman.
        }
    }
}
