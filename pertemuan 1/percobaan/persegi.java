public class persegi {
    public int sisi;

    public persegi(int sisi) {
        this.sisi = sisi;
    }

    public void showSisi() {
        System.out.println("Sisi Persegi : " + sisi);
    }

    public int luasPersegi() {
        return sisi * sisi;
    }

    public int kelilingPersegi() {
        return 4 * sisi;
    }

}
