package percobaan;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public void setKode(String setkode) {
        this.kode = setkode;
    }

    public String getKode() {
        return kode;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        Kursi kursi = this.arrayKursi[nomor - 1];
        if (kursi.getpenumpang() == null) {
            kursi.setPenumpang(penumpang);
            System.out.println("Penumpang " + penumpang.getNama() + " berhasil ditempatkan di kursi " + nomor);
        } else {
            System.out.println("Kursi " + nomor + " sudah ditempati oleh penumpang lain.");
        }
    }

    // public void setPenumpang(Penumpang penumpang, int nomor) {
    // this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    // }

    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}
