package percobaan;

public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
        System.out.println();
        Penumpang budi = new Penumpang("67890", "budi");
        gerbong.setPenumpang(budi, 1);
        System.out.println(gerbong.info());
    }
}
