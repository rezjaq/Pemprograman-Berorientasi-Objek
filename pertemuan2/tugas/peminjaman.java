class peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;

    public int totalHarga(int lamaSewa) {
        int totalHarga = lamaSewa * harga;
        return totalHarga;
    }

    public void tampilData() {
        System.out.println("Struk Nota Peminjaman");
        System.out.println("Id : " + id);
        System.out.println("Nama member : " + namaMember);
        System.out.println("Nama game : " + namaGame);
        System.out.println("Harga : Rp." + harga);
    }
}