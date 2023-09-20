public class TestMahasiswa {
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa();
        mahasiswa mhs2 = new mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Reza";
        mhs1.alamat = "Jln.Kelapa No 02 Gang 02 ";
        mhs1.kelas = "2C";
        mhs1.tampilBiodata();
        System.out.println();
        mhs1.nim = 102;
        mhs1.nama = "Mupid";
        mhs1.alamat = "Jln.Daging No 03 Rt 04 ";
        mhs1.kelas = "2C";
        mhs1.tampilBiodata();
    }
}
