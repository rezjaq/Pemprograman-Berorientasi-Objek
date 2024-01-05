package Code.tugas;

public class Zombie implements Destroyable {
    // Tiap menyerang sebanyak 5 kali, maka akan naik level.
    int level;
    int health;

    public void Destroyed() {
        health -= 2;
    }

    public void heal(int level) {
        if (level == 1) {
            health += 10;
        } else if (level == 2) {
            health += 20;
        } else if (level == 3) {
            health += 30;
        }
    }

    public String getZombieInfo() {
        String info = "Health : " + health;
        info += "\nLevel : " + level;
        return info;
    }
}