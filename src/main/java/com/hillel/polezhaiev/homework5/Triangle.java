package main.java.com.hillel.polezhaiev.homework5;

public class Triangle implements GeometricFigure{

    private double side;
    private double height;

    public Triangle(double side, double height){
        this.side = side;
        this.height = height;

        if(side <= 0 || height <= 0){
            System.out.println("Enter a true value bigger than \"0\" ");
        }
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double areaOfFigure() {
        if(side <= 0 || height <= 0){
            return 0;
        }

        double area = (side * height) / 2;
        return area;
    }
}
