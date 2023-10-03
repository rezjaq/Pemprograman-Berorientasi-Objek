package percobaan;

public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil(null, 0);
        m.setnama("Avanza");
        m.setBiaya(350000);
        Sopir s = new Sopir(null, 0);
        s.setnama("John Doe");
        s.setBiaya(200000);
        Pelanggan p = new Pelanggan(null, m, s, 0);
        p.setNama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        p.info();
        System.out.println(p.getMobil().getNama());
        // System.out.println("Biaya Total = " + p.hitungBiayaTotal());
    }
}
