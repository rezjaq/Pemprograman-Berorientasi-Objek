public class demoPeminjaman {
    public static void main(String[] args) {
        peminjaman pjm1 = new peminjaman();
        pjm1.id = 1;
        pjm1.namaMember = "Ahmad Madara";
        pjm1.namaGame = "NARAKA BladePoint";
        pjm1.harga = 450000;
        int lama = 7;
        pjm1.tampilData();
        System.out.println("Berapa Lama penyewaaan : " + lama + " hari");
        System.out.println("Total harga : Rp." + pjm1.totalHarga(lama));
        System.out.println("----------------------------------------");
    }
}
