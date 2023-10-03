package percobaan;

public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i5", 3);
        Laptop l = new Laptop("Thinkpad", new Processor("Intel i5", 3));
        l.info();
        System.out.println("\n=================");
        Processor p1 = new Processor(null, 0);
        p1.setMerk("Intel i5");
        p1.setCache(4);
        Laptop l1 = new Laptop(null, p);
        l1.setMerk("Thinkpad");
        l1.setProc(p1);
        l1.info();
    }
}
