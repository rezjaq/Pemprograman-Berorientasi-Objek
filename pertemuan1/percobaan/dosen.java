public class dosen {
    public String nama, alamat, jabatan;
    public int nip;

    public dosen(String nama, String alamat, String jabatan, int nip) {
        this.nama = nama;
        this.alamat = alamat;
        this.jabatan = jabatan;
        this.nip = nip;
    }

    public void showBiodata() {
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Nip : " + nip);
    }
}
