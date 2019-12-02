package Day43.Task;
//create class Multiplier
//create method which multiply 2 integers
//create method which multiply 3 integers
//create method which multiply a list of integers
//create method which multiply 2 double
//and test them using junit

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Multiplier {
    static int multiply(int a, int b) {
        return a * b;
    }

    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static int multiply(List<Integer> list) {
        int result= 1;
        for (Integer num : list) {
            result *= num;
        }
        return result;

    }

@Test
public void testmultiplyTwoNumbers(){
    Assert.assertEquals(4, multiply(2, 2));
}
@Test
    public void testmultiplyThreeNumbers(){
        Assert.assertEquals(20, multiply(5, 2, 2));
}
@Test
    public void testListInt(){
    Multiplier m3 = new Multiplier();
    List<Integer> list = Arrays.asList(1,2,3);
    int expected = 6;
    int actual = m3.multiply(list);

    Assert.assertEquals(expected, actual);
}
@Test
    public void DoubleMultiply(){
    double actual = multiply(2.0, 2.0);
    double expected = 4.0;


    Assert.assertEquals(expected, actual, 1);
}
}

