package main.java.com.hillel.polezhaiev.homework5;

public class Square implements GeometricFigure{

    private double side;

    public Square(double side){
        this.side = side;

        if(side <= 0){
            System.out.println("Enter a true value bigger than \"0\" ");
        }
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double areaOfFigure() {
        if(side <= 0){
            return 0;
        }

        double area = side * side;
        return area;
    }
}
