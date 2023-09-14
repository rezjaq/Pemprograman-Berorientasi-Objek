package percobaan;

/**
 * motor
 */
public class motor {
    private int speed = 0;
    private boolean kontakOn = false;

    public void startEngine() {
        kontakOn = true;
    }

    public void turnOffEngine() {
        kontakOn = false;
        speed = 0;
    }

    public void addSpeed() {
        if (kontakOn == true) {
            speed += 5;
        } else {
            System.out.println("Kecepatan tidak bisa ditambah karena masin off \n");
        }
    }

    public void reduceSpeed() {
        if (kontakOn == true) {
            speed -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa ditambah karena mesin off \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + speed + "\n");
    }
}