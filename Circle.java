public class Circle {
    double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("There is no figure with such parameters");
        }
        this.radius = radius;
    }

    public double findPerimeter() {
        return 2 * 3.14 * radius;
    }

    public double findSquare() {
        return 3.14 * radius * radius;
    }
}











