package tugas;

public class Windows extends Laptop {
    public String fitur;

    public Windows() {
    }

    public Windows(String fitur, String jnsBaterai, String merk, String jnsProcessor, int kecProcessor,
            int sizeMemory) {
        super(jnsBaterai, merk, jnsProcessor, kecProcessor, sizeMemory);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        super.tampilData();
        System.out.println("Fitur\t\t\t: " + fitur);
    }

}
