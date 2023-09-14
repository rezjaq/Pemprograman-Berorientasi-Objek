package percobaan;

public class motorDemo {
    public static void main(String[] args) {
        motor mntr = new motor();
        // percobaan 1
        // mntr.printStatus();
        // mntr.speed = 50;
        // mntr.printStatus();

        // percobaan 2
        mntr.printStatus();
        mntr.addSpeed();

        mntr.startEngine();
        mntr.printStatus();

        mntr.addSpeed();
        mntr.printStatus();

        mntr.addSpeed();
        mntr.printStatus();

        mntr.addSpeed();
        mntr.printStatus();

        mntr.turnOffEngine();
        mntr.printStatus();
    }
}
