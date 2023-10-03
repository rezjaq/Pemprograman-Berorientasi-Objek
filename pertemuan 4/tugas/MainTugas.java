package tugas;

import java.util.Scanner;

public class MainTugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bioskop bioskopA = new Bioskop("Bioskop A", "Jl. ABC No. 123", 3);

        Film film1 = new Film("Avengers: Endgame", "Action", 181);
        Film film2 = new Film("Toy Story 4", "Animation", 100);
        Film film3 = new Film("Joker", "Drama", 122);

        bioskopA.setFilmTersedia(film1, 1);
        bioskopA.setFilmTersedia(film2, 2);
        bioskopA.setFilmTersedia(film3, 3);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Pesan Tiket");
            System.out.println("2. Keluar");
            System.out.print("Pilih menu (1/2): ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.print("Nama Pengguna: ");
                    String namaPengguna = input.nextLine();
                    System.out.print("Email Pengguna: ");
                    String emailPengguna = input.nextLine();
                    Pengguna pengguna = new Pengguna(namaPengguna, emailPengguna);
                    System.out.println();
                    System.out.println("Daftar Film yang Tersedia:");
                    bioskopA.tampilkanFilmTersedia();
                    System.out.print("Pilih nomor film: ");
                    int nomorFilm = input.nextInt();
                    input.nextLine();

                    System.out.print("Nomor Kursi: ");
                    String nomorKursi = input.nextLine();

                    Film filmDipesan = bioskopA.getFilmTersedia(nomorFilm);
                    Pemesanan pesanan = new Pemesanan(filmDipesan, pengguna, bioskopA, nomorKursi);
                    System.out.println();
                    System.out.println("Informasi Pemesanan:");
                    System.out.println(pesanan.info());
                    break;

                case 2:
                    System.out.println("Terima kasih! Keluar dari program.");
                    input.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
                    break;
            }
        }
    }
}
