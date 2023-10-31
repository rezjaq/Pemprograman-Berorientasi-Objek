package percobaan;

public class Manager extends Karyawan {
    public int tunjangan;

    public Manager() {
    }

    public void tampilManager() {
        super.tampilKaryawan();
        System.out.println("Tunjangan\t: " + tunjangan);
        System.out.println("Total Gaji\t: " + (super.gaji + tunjangan));
    }
}
