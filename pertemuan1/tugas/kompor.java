public class kompor {
    public String jenis;
    public boolean nyalaKompor;
    public int ukuranApi;

    public kompor(String jenis) {
        this.jenis = jenis;
        this.nyalaKompor = false;
    }

    public void Kompornyala() {
        if (!nyalaKompor) {
            nyalaKompor = true;
            System.out.println(jenis + " dinyalakan");
        } else {
            System.out.println(jenis + " Sudah Menyala");
        }
    }

    public void KomporMati() {
        if (nyalaKompor) {
            nyalaKompor = false;
            System.out.println(jenis + " dimatikan");
        } else {
            System.out.println(jenis + " Sudah dimatikan");
        }
    }

    public void ubahUkuranApi(int ukuranApi) {
        if (nyalaKompor) {
            ukuranApi = ukuranApi;
            System.out.println(jenis + " api diubah menjadi " + ukuranApi);
        } else {
            System.out.println(jenis + " belum dinyalakan.");
        }
    }

    public void tampil() {
        System.out.println("Jenis: " + jenis);
        System.out.println("Status: " + (nyalaKompor ? "Menyala" : "Mati"));
        System.out.println("Ukuran Api: " + ukuranApi);
    }
}
