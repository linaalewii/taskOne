public class Rectangle {
    double width, length;
    public Rectangle(double length, double width) {
        if ((length <= 0) || (width <= 0)) {
            throw new RuntimeException("there is no figure with such parameters");
        }
        this.length = length;
        this.width = width;
    }

    public double findSquare() {
        return length*width;
    }

    public double findPerimeter() {
        return 2*(length+width);
    }
}







