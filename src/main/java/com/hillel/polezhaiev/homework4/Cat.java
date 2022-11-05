package main.java.com.hillel.polezhaiev.homework4;

public class Cat extends Animal{

    private String name;

    public static int amount;

    public Cat(String name) {
        super(name);
        this.name = name;
        amount++;
    }

    @Override
    public void swim(int length){
        System.out.println(name + " can't swim ");

    }

    @Override
    public void run(int length){
        if(length > 200)
        {
            System.out.println(name + " ran 200m");

        } else if(length < 0){
            System.out.println(name + " ran 0m");

        } else {
            System.out.println(name + " ran " + length + "m");
        }
    }


}
