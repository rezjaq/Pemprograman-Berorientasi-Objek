public class laptop {
    private int harga, jumlahLaptop;
    private String merek;

    public void setHarga(int newValue) {
        harga = newValue;
    }

    public void setJumlah(int newValue) {
        jumlahLaptop = newValue;
    }

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public int tambahJumlah(int j) {
        jumlahLaptop += j;
        return jumlahLaptop;
    }

    public int kurangiJumlah(int j) {
        jumlahLaptop -= j;
        return jumlahLaptop;
    }

    public void info() {
        System.out.println("\n---------------------------------------");
        System.out.println("Merek Laptop\t\t: " + merek);
        System.out.println("Harga Laptop\t\t: Rp." + harga);
        System.out.println("Jumlah Laptop\t\t: " + jumlahLaptop);
        System.out.println("---------------------------------------");
    }
}
