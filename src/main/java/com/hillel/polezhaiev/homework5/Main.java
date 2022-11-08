package main.java.com.hillel.polezhaiev.homework5;

public class Main {
    public static void main(String[] args) {
        GeometricFigure [] figures = {
                new Circle(2),
                new Square(3),
                new Triangle(2, 3)
        };

        for(GeometricFigure figure: figures){
            System.out.printf("%.2f", figure.areaOfFigure());
            System.out.println();
        }

        System.out.println();
        System.out.printf("Whole area: %.2f", sumOfArea(figures));
    }

    static double sumOfArea(GeometricFigure[] figures){
        if(figures == null){
            return 0;
        }

        double sum = 0;
        for(GeometricFigure figure: figures){
            sum += figure.areaOfFigure();
        }
        return sum;
    }
}
