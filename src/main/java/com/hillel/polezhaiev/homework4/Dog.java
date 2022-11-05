package main.java.com.hillel.polezhaiev.homework4;

public class Dog extends Animal{

    public static int amount;
    private String name;

    public Dog(String name) {
        super(name);
        this.name = name;
        amount++;
    }

    @Override
    public void swim(int length){
        if(length > 10) {
            System.out.println(name + " swam 10m");

        } else if(length < 0) {
            System.out.println(name + " swam 0m");

        } else {
            System.out.println(name + " swam " + length + "m");
        }
    }

    @Override
    public void run(int length){
        if(length > 500)
        {
            System.out.println(name + " ran 500m");

        } else if(length < 0){
            System.out.println(name + " ran 0m");

        } else {
            System.out.println(name + " ran " + length + "m");
        }
    }

}
