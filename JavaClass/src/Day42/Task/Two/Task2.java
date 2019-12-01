package Day42.Task.Two;

import Day42.Task.Two.Circle;
import Day42.Task.Two.Rectangle;

public class Task2 {
    public static void main(String[] args) {
        // create base class Shape add attributes
        // create two subclass as Circle and Rectangle

        // Shape: color, filled
        // Circle: radius
        // Rectangle: width, length
            Circle circle = new Circle();
            circle.setColor("Green");
            circle.setRadius(10.0);
            circle.setFilled(true);

            Rectangle rectangle = new Rectangle("Yellow", true, 5, 3);

    }

}
