package chapter05;

public class Task15 {
    public static void main(String[] args) {
        System.out.println("Create shapes.");
        Circle circle1 = new Circle(3, "blue");
        System.out.println("Created circle with " + circle1.radius +" radius in "+circle1.color);
        System.out.println("The circle area is " + circle1.calculateArea() +" sq. units.");
        System.out.println("The circle perimeter is "+ circle1.calculatePerimeter() +" units.");
        Rectangle rect1 = new Rectangle(3, 4, "orange");
        System.out.println("Created rectangle with " + rect1.length +" length and "+ rect1.width +" width in "+rect1.color);
        System.out.println("The rectangle area is " + rect1.calculateArea() +" sq. units.");
        System.out.println("The rectangle perimeter is "+ rect1.calculatePerimeter() +" units.");
    }
}

interface Shape {
    public static final double PI = 3.1416;
    double calculateArea();
    double calculatePerimeter();
}

abstract class AbstractShape implements Shape {
    double width;
    String color;

    public double calculatePerimeter() {
        return 0;
    }

    public double calculateArea() {
        return 0;
    }

    public AbstractShape() {

    }

    public AbstractShape(double width) {
        this(width, "white");
    }
    public AbstractShape(double width, String color) {
        this.width = width;
        this.color = color;
    }
}

class Circle extends AbstractShape {
    double radius;
    public double calculateArea() {
        return (super.PI * this.radius * this.radius);
    }
    public double calculatePerimeter() {
        return (super.PI * (2 * radius));
    }

    public Circle(double radius) {
        this(radius, "white");
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
}

class Rectangle extends AbstractShape {
    double length;

    public double calculateArea() {
        return (this.length * this.width);
    }
    public double calculatePerimeter() {
        return (2 * (this.length + this.width));
    }

    public Rectangle() {
        this( 1, 1, "green");
    }
    public Rectangle(double length) {
        this(length, 1, "green");
    }
    public Rectangle(double length, double width) {
        this(length, width, "green");
    }
    public Rectangle(double length, double width, String color) {
        super();
        this.length = length;
        this.width = width;
        this.color = color;
    }
}
