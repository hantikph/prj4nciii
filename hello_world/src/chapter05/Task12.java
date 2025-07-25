package chapter05;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("("+ x +", "+ y +")");
    }

    public void scale() {
        // closer by half to (0, 0)
        double resize = 0.5;
        this.x = x * resize;
        this.y = y * resize;
    }
}

public class Task12 {
    public static void main(String[] args) {
        Point p = new Point(32, 32);
        for (int i=0; i<5; i++) {
            p.scale();
            p.print();
        }
    }
}
