import java.util.*;

public class tampilPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        persegi ps[] = new persegi[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan Sisi Persegi : ");
            int user = input.nextInt();
            ps[i] = new persegi(user);
            System.out.println("Jumlah sisi : " + ps[i].luasPersegi());
            System.out.println("Keliling Persegi : " + ps[i].kelilingPersegi());
            System.out.println();
        }
    }
}
