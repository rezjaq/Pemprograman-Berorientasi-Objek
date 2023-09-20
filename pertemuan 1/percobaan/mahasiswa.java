public class mahasiswa {
    String nama, alamat;
    int nim;

    public mahasiswa(String nama, String alamat, int nim) {
        this.nama = nama;
        this.alamat = alamat;
        this.nim = nim;
    }

    public void showBiodata() {
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Nim : " + nim);
    }
}
