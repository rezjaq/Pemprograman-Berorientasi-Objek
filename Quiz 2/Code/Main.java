package Code;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Rizqi", "2241720057", new int[] { 80, 75, 85 });
        Mahasiswa mahasiswa2 = new Mahasiswa("Reza Danuarta", "2241720058", new int[] { 90, 85, 80 });

        MataKuliah mataKuliah1 = new MataKuliah("DESPROWEB", 3, 85);
        MataKuliah mataKuliah2 = new MataKuliah("BASDAT", 4, 70);

        Perwalian perwalian = new Perwalian(2, 5);
        perwalian.tambahMahasiswa(0, mahasiswa1);
        perwalian.tambahMahasiswa(1, mahasiswa2);

        perwalian.tambahMataKuliah(0, 0, mataKuliah1);
        perwalian.tambahMataKuliah(1, 0, mataKuliah2);

        perwalian.cetakDataMahasiswa();
    }
}
