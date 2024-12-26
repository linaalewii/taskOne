public class Triangle {
    double side1, side2, side3;

    public Triangle(double side1, double side2, double side3){
        if ((side1 <= 0) || (side2 <= 0) || (side3 <= 0)){
            throw  new RuntimeException("There is no figure with such parameters.");
        }
        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        else{
            throw new RuntimeException("There is no figure with such parameters.");
        }
    }

    public double findPerimeter(){
        return side1 + side2 + side3;
    }

    public double findSquare(){
        double p = (side1 + side2 + side3)/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }
}

