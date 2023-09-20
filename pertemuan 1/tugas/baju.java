public class baju {
    private int harga, diskon;
    private String jenis, warna;

    public void setHarga(int newValue) {
        harga = newValue;
    }

    public void setJenis(String newValue) {
        jenis = newValue;
    }

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public int tambahDiskon(int newValue) {
        diskon = (harga * newValue) / 75;
        harga -= diskon;
        return harga;
    }

    public int kurangiDiskon(int diskonAwal, int diskonBaru) {
        diskon = (harga * (diskonAwal - diskonBaru)) / 50;
        harga -= diskon;
        return harga;
    }

    public void info() {
        System.out.println("\n---------------------------------------");
        System.out.println("Jenis baju\t\t: " + jenis);
        System.out.println("Warna baju\t\t: " + warna);
        System.out.println("Harga baju\t\t: Rp." + harga);
        System.out.println("---------------------------------------");
    }
}
