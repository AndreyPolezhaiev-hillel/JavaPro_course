package main.java.com.hillel.polezhaiev.h5secondpart;

public class Cat extends Participant{

    public Cat(String name, int length, double height) {
        super(name, length, height);
    }

    @Override
    String getClassName() {
        return "Cat";
    }

    @Override
    public void run() {
        System.out.println("Cat " + super.getName() + " ran a running track");
    }

    @Override
    public void jump() {
        System.out.println("Cat " + super.getName() + " jumped a wall");
    }


}
