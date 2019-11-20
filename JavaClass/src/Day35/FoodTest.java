package Day35;

import static org.junit.jupiter.api.Assertions.*;

class FoodTest {


    @org.junit.jupiter.api.Test
    void hasButter() {
        Food food = new Food(); // MyClass is tested
        food.oil ="butter";
        Boolean actual = food.hasButter("butter");
        assertEquals(true, actual);
    }
        @org.junit.jupiter.api.Test
        void taste () {
        }
    }
