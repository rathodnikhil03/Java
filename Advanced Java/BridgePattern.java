// Implementor
interface Color {
    void applyColor();
}

// Concrete Implementor 1
class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red color.");
    }
}

// Concrete Implementor 2
class BlueColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying blue color.");
    }
}

// Abstraction
abstract class Shape {
    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

// Refined Abstraction 1
class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Drawing Circle. ");
        color.applyColor();
    }
}

// Refined Abstraction 2
class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Drawing Square. ");
        color.applyColor();
    }
}

public class BridgePattern {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape blueSquare = new Square(new BlueColor());

        redCircle.draw();  // Output: Drawing Circle. Applying red color.
        blueSquare.draw(); // Output: Drawing Square. Applying blue color.
    }
}
