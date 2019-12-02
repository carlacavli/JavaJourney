package Day43.Overriding.Salary;

public class JuniorTesterSalary  extends TesterBaseSalary {

    @Override
    public int getSalary() {
        return super.getSalary() - 50_000;
    }
    }



