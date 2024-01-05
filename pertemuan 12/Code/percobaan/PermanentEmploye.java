package Code.percobaan;

public class PermanentEmploye extends Employe implements Payable {
    private int salary;

    public PermanentEmploye(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPaymentAmount() {
        return (int) (salary + 0.5 * salary);
    }

    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Register as permanent employee with salary " + salary + "\n";
        return info;
    }
}
