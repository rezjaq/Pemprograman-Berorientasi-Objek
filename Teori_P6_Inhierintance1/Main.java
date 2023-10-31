public class Main {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        Lingkaran lingkaran = new Lingkaran();
        Segitiga segitiga = new Segitiga();

        // Persegi Panjang
        persegiPanjang.lebar = 20;
        persegiPanjang.panjang = 30;
        persegiPanjang.luas();
        persegiPanjang.keliling();

        // Lingkaran
        lingkaran.r = 27;
        lingkaran.luas();
        lingkaran.keliling();

        // Segitiga
        segitiga.alas = 17;
        segitiga.tinggi = 27;
        segitiga.luas();
        segitiga.keliling();
    }
}
