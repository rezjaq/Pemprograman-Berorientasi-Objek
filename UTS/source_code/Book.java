package source_code;

public class Book {
    public class Buku {
        private String ISBN;
        private String judul;
        private Author author;
        private int harga;

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String iSBN) {
            ISBN = iSBN;
        }

        public String getJudul() {
            return judul;
        }

        public void setJudul(String Judul) {
            judul = Judul;
        }

        public int getHarga() {
            return harga;
        }

        public void setHarga(int Harga) {
            harga = Harga;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            author = author;
        }
    }

}