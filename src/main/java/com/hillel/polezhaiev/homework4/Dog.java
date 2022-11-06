package main.java.com.hillel.polezhaiev.homework4;

public class Dog extends Animal{

    private static int amount;

    public Dog(String name) {
        super(name);
        amount++;
    }

    public static int getAmount() {
        return amount;
    }

    @Override
    public void swim(int length){
        if(length > 10) {
            System.out.println(this.getName() + " swam 10m");

        } else if(length < 0) {
            System.out.println(this.getName() + " swam 0m");

        } else {
            System.out.println(this.getName() + " swam " + length + "m");
        }
    }

    @Override
    public void run(int length){
        if(length > 500)
        {
            System.out.println(this.getName() + " ran 500m");

        } else if(length < 0){
            System.out.println(this.getName() + " ran 0m");

        } else {
            System.out.println(this.getName() + " ran " + length + "m");
        }
    }

}
