public class TugasBarang {
    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        int hargaJual = (int) (hargaDasar - ((diskon * hargaDasar) / 100));
        return hargaJual;
    }

    public void tampil() {
        System.out.println("Kode barang : " + kode);
        System.out.println("Nama barang : " + namaBarang);
        System.out.println("Harga dasar : Rp. " + hargaDasar);
        System.out.println("Diskon : " + diskon + "%");
    }
}
