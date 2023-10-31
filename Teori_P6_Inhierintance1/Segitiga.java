import static java.lang.Math.sqrt;

public class Segitiga extends BangunDatar {
    public float alas;
    public float tinggi;

    @Override
    public float luas() {
        float luas = (alas * tinggi) / 2;
        System.out.println("Luas Segitiga\t\t\t: " + luas);
        return luas;
    }

    @Override
    public float keliling() {
        float m = (float) sqrt((alas * alas) + (tinggi * tinggi));
        float keliling = m + alas + tinggi;
        System.out.println("Keliling Segitiga\t\t: " + keliling);
        return keliling;
    }
}
