package Day42.Task.Two;
// create base class Shape add attributes
// create two subclass as Circle and Rectangle

// Shape: color, filled
// Circle: radius
// Rectangle: width, length

public class Shape {
    private String color;
    private boolean filled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
