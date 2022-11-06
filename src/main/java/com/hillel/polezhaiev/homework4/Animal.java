package main.java.com.hillel.polezhaiev.homework4;

public class Animal {

    public static int amount;
    private String name;

    public Animal(String name){
        this.name = name;
        amount++;
    }

    public String getName() {
        return name;
    }

    public void swim(int length){
        if(length < 0){
            System.out.println(name + " swam 0m");
        }else {
            System.out.println(name + " swam " + length);

        }
    }

    public void run(int length){
        if(length < 0){
            System.out.println(name + " swam 0m");
        } else {
            System.out.println(name + " ran " + length);

        }
    }
}
