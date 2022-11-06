package main.java.com.hillel.polezhaiev.homework4;

public class Cat extends Animal{

    public static int amount;

    public Cat(String name) {
        super(name);
        amount++;
    }

    @Override
    public void swim(int length){
        System.out.println(this.getName() + " can't swim ");

    }

    @Override
    public void run(int length){
        if(length > 200)
        {
            System.out.println(this.getName() + " ran 200m");

        } else if(length < 0){
            System.out.println(this.getName() + " ran 0m");

        } else {
            System.out.println(this.getName() + " ran " + length + "m");
        }
    }


}
