package Code;

class MataKuliah {

    private String namaMataKuliah;
    private int sks;
    private int nilaiMahasiswa;

    public MataKuliah(String namaMataKuliah, int sks, int nilaiMahasiswa) {
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
        this.nilaiMahasiswa = nilaiMahasiswa;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public int getNilaiMahasiswa() {
        return nilaiMahasiswa;
    }

    public void setNilaiMahasiswa(int nilaiMahasiswa) {
        this.nilaiMahasiswa = nilaiMahasiswa;
    }

    public String hitungBobot() {
        if (nilaiMahasiswa >= 80) {
            return "A";
        } else if (nilaiMahasiswa >= 70) {
            return "B";
        } else if (nilaiMahasiswa >= 60) {
            return "C";
        } else if (nilaiMahasiswa >= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    public String hitungBobot(int[] bobotMahasiswa) {
        if (nilaiMahasiswa >= 80) {
            return convertToGrade(bobotMahasiswa[0]);
        } else if (nilaiMahasiswa >= 70) {
            return convertToGrade(bobotMahasiswa[1]);
        } else if (nilaiMahasiswa >= 60) {
            return convertToGrade(bobotMahasiswa[2]);
        } else if (nilaiMahasiswa >= 50) {
            return convertToGrade(bobotMahasiswa[3]);
        } else {
            return convertToGrade(bobotMahasiswa[4]);
        }
    }

    private String convertToGrade(int bobot) {
        return String.valueOf((char) bobot);
    }
}
