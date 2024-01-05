package Code;

class Mahasiswa {

    private String nama;
    private String nim;
    private int[] nilai;

    public Mahasiswa(String nama, String nim, int[] nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int[] getNilai() {
        return nilai;
    }

    public void setNilai(int[] nilai) {
        this.nilai = nilai;
    }

    public double hitungIpk() {
        double totalNilai = 0;
        for (int n : nilai) {
            totalNilai += n;
        }
        return totalNilai / nilai.length;
    }

    public double hitungIpk(int[] nilaiSks) {
        double totalNilaiSks = 0;
        double totalSks = 0;

        for (int i = 0; i < nilai.length; i++) {
            totalNilaiSks += nilai[i] * nilaiSks[i];
            totalSks += nilaiSks[i];
        }

        return totalNilaiSks / totalSks;
    }
}
