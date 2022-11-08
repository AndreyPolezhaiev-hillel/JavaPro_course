package main.java.com.hillel.polezhaiev.homework5;

public class Circle implements GeometricFigure{

    private double radius;

    public Circle(double radius){
        this.radius = radius;

        if(radius <= 0){
            System.out.println("Enter a true value bigger than \"0\" ");
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double areaOfFigure() {
        if(radius <= 0){
            return 0;
        }

        double area = Math.pow(radius, 2) * Math.PI;
        return area;
    }
}
