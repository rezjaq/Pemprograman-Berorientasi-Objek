package tugas;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        this.sudut = 180 - sudutA;
        return this.sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        this.sudut = 180 - (sudutA + sudutB);
        return this.sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA * sisiB * sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(Math.pow(sisiA, 2)) + Math.sqrt(Math.pow(sisiB, 2));
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        System.out.println("Total Sudut dengan 1 parameter : " + segitiga.totalSudut(15));
        System.out.println("Total Sudut dengan 2 parameter : " + segitiga.totalSudut(15, 20));
        System.out.println("Keliling dengan 2 parameter : " + segitiga.keliling(10, 12));
        System.out.println("Keliling dengan 3 parameter : " + segitiga.keliling(4, 5, 6));
    }
}
