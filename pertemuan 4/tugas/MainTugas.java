package tugas;

import java.util.Scanner;

public class MainTugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek bioskop
        Bioskop bioskopA = new Bioskop("Bioskop A", "Jl. ABC No. 123", 3);

        // Membuat objek film
        Film film1 = new Film("Avengers: Endgame", "Action", 181);
        Film film2 = new Film("Toy Story 4", "Animation", 100);
        Film film3 = new Film("Joker", "Drama", 122);

        // Menambahkan film ke dalam bioskop
        bioskopA.setFilmTersedia(film1, 0);
        bioskopA.setFilmTersedia(film2, 1);
        bioskopA.setFilmTersedia(film3, 2);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Pesan Tiket");
            System.out.println("2. Keluar");
            System.out.print("Pilih menu (1/2): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline dari input sebelumnya

            switch (choice) {
                case 1:
                    // Memasukkan data pengguna
                    System.out.print("Nama Pengguna: ");
                    String namaPengguna = scanner.nextLine();
                    System.out.print("Email Pengguna: ");
                    String emailPengguna = scanner.nextLine();
                    Pengguna pengguna = new Pengguna(namaPengguna, emailPengguna);

                    // Memilih film
                    System.out.println("Daftar Film yang Tersedia:");
                    bioskopA.tampilkanFilmTersedia();
                    System.out.print("Pilih nomor film: ");
                    int nomorFilm = scanner.nextInt();
                    scanner.nextLine(); // Membuang karakter newline dari input sebelumnya

                    System.out.print("Nomor Kursi: ");
                    String nomorKursi = scanner.nextLine();

                    // Membuat objek pemesanan
                    Film filmDipesan = bioskopA.getFilmTersedia(nomorFilm);
                    Pemesanan pesanan = new Pemesanan(filmDipesan, pengguna, bioskopA, nomorKursi);

                    // Menampilkan informasi pemesanan
                    System.out.println("Informasi Pemesanan:");
                    System.out.println(pesanan.info());
                    break;

                case 2:
                    System.out.println("Terima kasih! Keluar dari program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
                    break;
            }
        }
    }
}
