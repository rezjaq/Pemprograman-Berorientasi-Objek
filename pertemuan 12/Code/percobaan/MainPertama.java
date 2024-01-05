package Code.percobaan;

public class MainPertama {
    public static void main(String[] args) {
        PermanentEmploye pEmp = new PermanentEmploye("Dedik", 500);
        InternshipEmploye iEmp = new InternshipEmploye("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
        Employe e;
        Payable p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }

}
