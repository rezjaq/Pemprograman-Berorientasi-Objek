package Code.percobaan;

public class MainKedua {
    public static void main(String[] args) {
        PermanentEmploye pEmp = new PermanentEmploye("Dedik", 500);
        Employe e;
        e = pEmp;
        System.out.println("" + e.getEmployeeInfo());
        System.out.println("-----------------");
        System.out.println("" + pEmp.getEmployeeInfo());
    }

}
