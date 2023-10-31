public class PersegiPanjang extends BangunDatar {
    public float lebar;
    public float panjang;

    @Override
    public float luas() {
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang\t\t: " + luas);
        return luas;
    }

    @Override
    public float keliling() {
        float kll = 2 * panjang + 2 * lebar;
        System.out.println("Keliling Persegi Panjang\t: " + kll);
        return kll;
    }
}
