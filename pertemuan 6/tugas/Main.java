package tugas;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("           Informasi Perangkat Elektronik     ");
        System.out.println("=============================================");
        System.out.println();

        Laptop laptop = new Laptop("Li-Ion", "HP Envy 13", "Intel Core i7", 1, 16);
        System.out.println("=============== Informasi Laptop ===============");
        laptop.tampilLaptop();
        System.out.println();

        Pc pc = new Pc(25, "Dell XPS 8940", "Intel Core i9", 2, 64);
        System.out.println("=============== Informasi PC ===============");
        pc.tampilPc();
        System.out.println();

        Mac mac = new Mac("Apple M1 chip", "Li-Po", "MacBook Air", "Apple M1", 1, 8);
        System.out.println("=============== Informasi MacBook ===============");
        mac.tampilMac();
        System.out.println();

        Windows windows = new Windows("Backlit Keyboard", "Li-Ion", "Asus ZenBook", "AMD Ryzen 7", 2, 16);
        System.out.println("=============== Informasi Laptop Windows ===============");
        windows.tampilWindows();
        System.out.println();

        System.out.println("=============================================");
    }
}
