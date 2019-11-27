package Day40;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Person2Test {

    @Test
    void getPersonName() {
        Person2 p = new Person2();
        p.setPersonName(("techno"));

        String actual = p.getPersonName();
        String expected ="techno";

        Assert.assertEquals(actual,expected);
    }

    @Test
    void setPersonName() {
    }
    @Test
    void MethodTest() {
        Person2 t = new Person2();

        String actual =t.Method();
        String expected ="SomeValue";
        Assert.assertEquals(actual,expected);

    }

}