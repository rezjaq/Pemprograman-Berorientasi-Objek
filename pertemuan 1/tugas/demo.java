public class demo {
    public static void main(String[] args) {
        komporGas komporGas = new komporGas();
        komporListrik komporListrik = new komporListrik();

        komporGas.Kompornyala();
        komporGas.ubahUkuranApi(5);
        komporGas.KomporMati();
        System.out.println();

        komporListrik.Kompornyala();
        komporListrik.ubahUkuranApi(3);
        komporListrik.KomporMati();
        System.out.println();

        System.out.println();
        komporGas.tampil();
        System.out.println();
        komporListrik.tampil();
    }
}
