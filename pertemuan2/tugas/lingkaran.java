public class lingkaran {
    public double phi, r;

    public double hitungLuas() {
        double luas = phi * r * r;
        return luas;
    }

    public double hitungKeliling() {
        double keliling = 2 * phi * r;
        return keliling;
    }

    public void tampil() {
        System.out.println("phi : " + phi);
        System.out.println("jari jari : " + r);
        System.out.println("Luas Lingkaran : " + hitungLuas());
        System.out.println("Keliling lingkaran : " + hitungKeliling());
    }
}
