package Code.percobaan;

public class MainKetiga {
    public static void main(String[] args) {
        PermanentEmploye pEmp = new PermanentEmploye("Dedik", 500);
        InternshipEmploye iEmp = new InternshipEmploye("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
        Employe e[] = { pEmp, iEmp };
        Payable p[] = { pEmp, eBill };
        // Employee e2[] = {pEmp,iEmp,eBill}; tidak bisa karena error
    }
}
