public class TestBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.NamaBrg = "Spidol";
        brg1.JenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();
        // menampilkan dan mengisi argumen untuk menambhakan stok barang
        System.out.println("Stok baru adalah :" + brg1.tambahStok(20));
    }
}
