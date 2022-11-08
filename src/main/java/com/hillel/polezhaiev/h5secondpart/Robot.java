package main.java.com.hillel.polezhaiev.h5secondpart;

public class Robot extends Participant{

    public Robot(String name, int length, double height) {
        super(name, length, height);
    }

    @Override
    String getClassName() {
        return "Robot";
    }

    @Override
    public void run() {
        System.out.println("Robot " + super.getName() + " ran a running track");
    }

    @Override
    public void jump() {
        System.out.println("Robot " + super.getName() + " jumped a wall");
    }


}
