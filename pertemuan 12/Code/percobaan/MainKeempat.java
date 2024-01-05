package Code.percobaan;

import java.security.acl.Owner;

public class MainKeempat {
    public static void main(String[] args) {
        owner ow = new owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        ow.pay(eBill);
        System.out.println("---------------------------------------");

        PermanentEmploye pEmp = new PermanentEmploye("Dedik", 500);
        ow.pay(pEmp);
        System.out.println("---------------------------------------");

        IntershipEmploye iEmp = new IntershipEmploye("Sunarto", 5);
        ow.showEmployee(pEmp);
        System.out.println("---------------------------------------");
        ow.showEmployee(iEmp);
    }
}
