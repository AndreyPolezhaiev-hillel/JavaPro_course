package main.java.com.hillel.polezhaiev.h5secondpart;

public abstract class Participant {

    private String name;
    private int length;
    private double height;

    public Participant(String name, int length, double height) {
        this.name = name;
        this.length = length;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    abstract String getClassName();
    abstract void run();
    abstract void jump();


}
