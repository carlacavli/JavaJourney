package Day43.Overriding.Salary;


import Day43.Overriding.Salary.JuniorTesterSalary;
import Day43.Overriding.Salary.MiddleTesterSalary;
import Day43.Overriding.Salary.SeniorTesterSalary;
import Day43.Overriding.Salary.TesterBaseSalary;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestSalary {

    @Test
    public void testBaseSalary() {
        TesterBaseSalary s = new TesterBaseSalary();
//        Assert.assertEquals(100_000, s.getSalary());

        int actual = s.getSalary();
        int expected = 100_000;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testJunior() {
        JuniorTesterSalary j = new JuniorTesterSalary();
        Assert.assertEquals(50_000, j.getSalary());
    }

    @Test
    public void testMiddle() {
        MiddleTesterSalary m = new MiddleTesterSalary();
        Assert.assertEquals(110_000, m.getSalary());

    }

    @Test
    public void testSenior() {
        SeniorTesterSalary s = new SeniorTesterSalary();
        Assert.assertEquals(200_000, s.getSalary());

    }

    @Test
    public void testSumOfJuniorSalary() {
        JuniorTesterSalary j1 = new JuniorTesterSalary();
        JuniorTesterSalary j2 = new JuniorTesterSalary();
        JuniorTesterSalary j3 = new JuniorTesterSalary();
        Assert.assertEquals(150_000, j1.getSalary() + j2.getSalary() + j3.getSalary());
    }
//    int sum = 0;
//        for (int i = 0; i < 3; i++) {
//        TesterBaseSalary junior = new JuniorTesterSalary();
//        sum += junior.getSalary();
//    }
//    int actual = sum;
//
//        Assert.assertEquals(150_000, actual);
//
//}    bu da loop la yapilmis hali

    @Test
    public void testSumOfMiddleSalary() {

        // create N middle testers, sum their salary, and check if you have N*$ 110_000 in total
        // where N > 100
        int N = 1000;
        int sum = 0;
        for (int i = 0; i < N; i++) { // 0 1 2
            TesterBaseSalary junior = new MiddleTesterSalary();
            sum += junior.getSalary();
        }

        int actual = sum;
        Assert.assertEquals(N * 110_000, actual);


    }
}
