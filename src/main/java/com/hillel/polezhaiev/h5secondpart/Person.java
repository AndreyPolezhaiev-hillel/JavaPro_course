package main.java.com.hillel.polezhaiev.h5secondpart;

public class Person extends Participant{


    public Person(String name, int length, double height) {
        super(name, length, height);
    }

    @Override
    String getClassName() {
        return "Person";
    }

    @Override
    public void run() {
        System.out.println("Person " + super.getName() + " ran a running track");
    }

    @Override
    public void jump() {
        System.out.println("Person " + super.getName() + " jumped a wall");
    }

}
