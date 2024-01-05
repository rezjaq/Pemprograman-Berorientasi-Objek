package Code;

class Perwalian {
    private Mahasiswa[] dataMahasiswa;
    private MataKuliah[][] dataMataKuliah;

    public Perwalian(int jumlahMahasiswa, int jumlahMataKuliah) {
        dataMahasiswa = new Mahasiswa[jumlahMahasiswa];
        dataMataKuliah = new MataKuliah[jumlahMahasiswa][];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            dataMataKuliah[i] = new MataKuliah[jumlahMataKuliah];
        }
    }

    public void tambahMahasiswa(int index, Mahasiswa mahasiswa) {
        dataMahasiswa[index] = mahasiswa;
    }

    public void tambahMataKuliah(int indexMahasiswa, int indexMataKuliah, MataKuliah mataKuliah) {
        dataMataKuliah[indexMahasiswa][indexMataKuliah] = mataKuliah;
    }

    public void cetakDataMahasiswa() {
        for (int i = 0; i < dataMahasiswa.length; i++) {
            Mahasiswa mahasiswa = dataMahasiswa[i];
            System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Nilai Mahasiswa: " + mahasiswa.toString());
            System.out.println("Mata Kuliah yang Diambil:");
            for (int j = 0; j < dataMataKuliah[i].length; j++) {
                MataKuliah mataKuliah = dataMataKuliah[i][j];
                System.out.println("- Nama Mata Kuliah: " + mataKuliah.getNamaMataKuliah());
                System.out.println("- SKS: " + mataKuliah.getSks());
                System.out.println("- Nilai Mahasiswa: " + mataKuliah.getNilaiMahasiswa());
            }
            System.out.println();
        }
    }
}
