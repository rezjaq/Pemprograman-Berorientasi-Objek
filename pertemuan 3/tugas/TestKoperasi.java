package tugas;

import java.util.*;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama Anggota : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Nomer KTP :");
        int ktp = input.nextInt();
        System.out.print("Masukkan Limit Peminjamaan : ");
        int limit = input.nextInt();

        Anggota donny = new Anggota(nama, ktp, limit);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        System.out.print("Masukkan jumlah pinjaman: ");
        int jumlahPinjaman = input.nextInt();
        donny.pinjam(jumlahPinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.print("Masukkan jumlah angsuran: ");
        int jumlahAngsuran = input.nextInt();
        donny.angsur(jumlahAngsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        input.close();
        // Anggota donny = new Anggota("Donny", 11333444, 5000000);
        // System.out.println("Nama Anggota: " + donny.getNama());
        // System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        // System.out.println("\nMeminjam uang 10.000.000...");
        // donny.pinjam(10000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        // System.out.println("\nMeminjam uang 4.000.000...");
        // donny.pinjam(4000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        // System.out.println("\nMembayar angsuran 1.000.000");
        // donny.angsur(1000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        // System.out.println("\nMembayar angsuran 3.000.000");
        // donny.angsur(3000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}
