package Day43.Overriding.Salary;
//Create class TesterBaseSalary
// add method getSalary which will return 100,000 as salary

// create subclasses JuniorTesterSalary, MiddleTesterSalary, SeniorTesterSalary
// junior take 50,000 less than base
// middle gets 10,000 more than base
// senior get 100,000 more than base

// using polymorphism create methods in subclasses

import org.junit.Test;

public class TesterBaseSalary {

    public int getSalary() {
        return 100_000;
    }


}

