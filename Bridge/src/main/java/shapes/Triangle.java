package shapes;

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    public String draw() {
        return "Triangle drawn." + color.fill();
    }
}