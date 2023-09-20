public class TestTugasBarang {
    public static void main(String[] args) {
        TugasBarang brg = new TugasBarang();
        brg.kode = "01";
        brg.namaBarang = "Monitor Pc";
        brg.hargaDasar = 540000;
        brg.diskon = 15;
        brg.hitungHargaJual();
        brg.tampil();
    }
}
