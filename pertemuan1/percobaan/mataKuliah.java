public class mataKuliah {
    public String namaMatkul;
    public int sks, nilai;

    public mataKuliah(String namaMatkul, int sks, int nilai) {
        this.namaMatkul = namaMatkul;
        this.sks = sks;
        this.nilai = nilai;
    }

    public void showMatkul() {
        System.out.println("Mata Kuliah : " + namaMatkul);
        System.out.println("SKS : " + sks);
        System.out.println("Nilai : " + nilai);
    }

    public double hitungNilaiAkhir() {
        return (double) nilai * sks;
    }
}
