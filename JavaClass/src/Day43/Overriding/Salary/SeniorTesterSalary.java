package Day43.Overriding.Salary;

public class SeniorTesterSalary extends TesterBaseSalary {


    @Override
    public int getSalary() {
        return super.getSalary() + 100_000;
    }
}
