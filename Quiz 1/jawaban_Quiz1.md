<h1 align="center">
<br>
QUIZ 1

Pemprograman Berorerientasi Objek

<img src="img/Logo Polinema (Politeknik Negeri Malang).png">

<h2 align="center">

RIZQI REZA DANUARTA

2241720057

TI-2C

## Soal dan Jawaban Quiz 1

1. Class dan Object:
   - Apa yang dimaksud dengan "class" dalam pemrograman berorientasi objek?<br>
     jawaban : class adalah sebuah blueprint atau template yang digunakan untuk membuat sebuah objek dalam suatu pemrograman karena tanpa ada class maka objek tidak akan bisa di buat
   * Bagaimana Anda mendefinisikan objek dari suatu class dalam bahasa pemrograman Java?<br>
     jawaban : untuk mendefinisikan sebuah objek dibutuhkan beberapa hal yaitu pertama adalah deklarasi objek dimana deklarasi ini membuat objek yang kita butuhkan dengan menyebutkan nama class dan diikuti nama objek yang kita butuhkan lalu instansiasi objek digunakan untuk mengalokasikan objek dan yang terakhir menginisialisasi objek dengan kata kunci new inisialisasi digunakan untuk mengatur nilai didalam atribut objek yang telah dibuat.
   * Misalkan Anda memiliki class "Barang" dalam sistem informasi inventaris.Bagaimana Anda akan membuat objek "laptop" dari class tersebut?<br>
     jawaban : pertama instasiasi terlebih dahulu seperti ini Barang laptop = new Barang(); setelah itu baru inisialisasi objek seperti ini laptop.setNama("Laptop Acer 2000cc"); laptop.setHarga(12000000): laptop.info();
2. Encapsulation:
   - Jelaskan konsep encapsulation dalam pemrograman berorientasi objek dan mengapa hal ini penting dalam pengembangan sistem informasi inventaris barang.<br>
     jawaban : encapsulation adalah suatu cara untuk menyembunyikan informasi detail dari suatu class yang lebih identik keamanan karena encapsulation digunakan untuk mengemas data atribut dan method yang berproses pada class
   - Dalam konteks sistem informasi inventaris, sebutkan contoh atribut (variabel) yang harus di-encapsulate dan mengapa.<br>
     jawaban : contoh atribut (variabel) yang harus di encapsulate dalam class barang yaitu bisa harga barang, stok barang karena untuk menghindari dari manipulasi langsung atribut tersebut
3. Relasi Kelas:
   - Apa yang dimaksud dengan relasi antara kelas dalam pemrograman berorientasi objek?<br>
     jawaban : bagaimana class yang telah dibuat bisa berinteraksi satu sama lain dimana class class tersebut memiliki relasi diantaranya inherintance, association, dependency
   - Dalam sistem informasi inventaris barang, bagaimana Anda akan menggambarkan relasi antara kelas "Barang" dan kelas "Kategori"?<br>
     jawaban : relasi antara barag dan kategori memiliki jenis relasi asociation karena setiap barang dapat terkait dengan satu atau lebih kategori dan setiap kategori dapat berhubungan dengan banyak barang
4. PBL:

   - Berdasarkan kasus sistem informasi inventaris barang, coba buat sebuah class sederhana beserta atribut dan metodenya yang menggambarkan suatu entitas dalam sistem tersebut (misalnya, class "Barang").<br>
     jawaban :

     ```java
     public class Barang {
     private String nama;
     private int stok;
     private boolean tersedia;

     public Barang(String nama, int stok, boolean tersedia){
         this.nama = nama;
         this.stok = stok;
         this.tersedia = tersedia;
     }

     public String getNama() {
        return nama;
     }

     public void setNama(String nama) {
        this.nama = nama;
     }

     public int getStok() {
        return stok;
     }

     public void setStok(int stok) {
        this.stok = stok;
     }

     public boolean isTersedia() {
        return tersedia;
     }

     public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
     }

     public String info(){
        String info = "";
        info += "nama barang : " + nama;
        info += "stok barang : " + stok;
        info += "apakah barang tersedia : " + tersedia;
     return info;
     }
     }
     ```

   - Bagaimana Anda akan menggunakan encapsulation untuk melindungi atribut-atribut dalam class tersebut?<br>
     jawaban : pada kode diatas terdapat encapsulation dimana untuk mengamankan atribut atribut diatas saya menggunakan private, serta metode setter dan getter agar atribut tersebut hanya bisa diakses pada class yang terhubung relasi pada class diatas.
   - Gambarkan hierarki class atau hubungan antar class yang mungkin ada dalam sistem informasi inventaris barang di jurusan Teknologi Informasi. Berikan contoh relasi antar class (misalnya, inheritance atau association) dalam konteks tersebut<br>
     jawaban :
     ![Alt text](image.png)
     jadi dalam relasi class diagram diatas terdapat jenis relasi asosiasi dimana class barang terhubung dengan class kategori karena setiap barang pasti mempunyai kategori, class peminjaman terhubung dengan barang jadi setiap peminjaman pasti melibatkan objek barang dan peminjaman terhubung dengan mahasiswa ini berarti setiap peminjaman dilakukan oleh seorang mahasiswa tertentu.
