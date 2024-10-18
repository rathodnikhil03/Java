import java.util.ArrayList;
import java.util.List;

// Prototype interface
interface Shape {
    Shape clone();
    void draw();
}

// Concrete prototype class for Circle
class Circle implements Shape {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Circle(this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle of color: " + color);
    }
}

// Concrete prototype class for Rectangle
class Rectangle implements Shape {
    private String color;

    public Rectangle(String color) {
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle of color: " + color);
    }
}



public class PrototypePatternExample {
    public static void main(String[] args) {
        // Create original shapes
        Shape circle = new Circle("Red");
        Shape rectangle = new Rectangle("Blue");

        // Create a list to hold cloned shapes
        List<Shape> shapes = new ArrayList<>();

        // Clone shapes and add to the list
        shapes.add(circle.clone());
        shapes.add(rectangle.clone());

        // Draw cloned shapes
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}