package Code.percobaan;

public class owner {
    public void pay(Payable p) {
        System.out.println("Total payment = " + p.getPaymentAmount());
        if (p instanceof ElectricityBill) {
            ElectricityBill eb = (ElectricityBill) p;
            System.out.println("" + eb.getBillInfo());
        } else if (p instanceof PermanentEmploye) {
            PermanentEmploye pe = (PermanentEmploye) p;
            pe.getEmployeeInfo();
            System.out.println("" + pe.getEmployeeInfo());
        }
    }

    public void showEmployee(Employe e) {
        System.out.println("" + e.getEmployeeInfo());
        if (e instanceof PermanentEmploye)
            System.out.println("You have to pay her/him monthly!!");
        else
            System.out.println("No need to pay him/her :)");
    }
}
