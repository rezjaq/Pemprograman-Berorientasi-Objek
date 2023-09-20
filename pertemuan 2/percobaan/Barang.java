public class Barang {
    public String NamaBrg;
    public String JenisBrg;
    public int stok;

    public void tampilBarang() {
        System.out.println("Nama Barang : " + NamaBrg);
        System.out.println("Jenis Barang : " + JenisBrg);
        System.out.println("Stok Barang : " + stok);
    }

    // method dengan argumen dan nilai balik retrun
    public int tambahStok(int brgMasuk) {
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }
}
