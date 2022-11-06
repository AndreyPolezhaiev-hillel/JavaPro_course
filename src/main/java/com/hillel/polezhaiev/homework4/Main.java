package main.java.com.hillel.polezhaiev.homework4;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Tom");
        Animal cat1 = new Cat("Tom");
        Animal cat2 = new Cat("Tom");
        Animal cat3 = new Cat("Tom");

        Animal dog = new Dog("Rex");
        Animal dog1 = new Dog("Rex");

        cat.swim(300);
        cat.run(300);
        cat.run(-122);

        System.out.println();

        dog.swim(-123);
        dog.swim(11);
        dog.run(-154);
        dog.run(900);

        System.out.println();

        System.out.println("Cats' amount " + Cat.getAmount());
        System.out.println("Dogs' amount " + Dog.getAmount());
        System.out.println("Animals' amount " + Animal.getAmount());

        System.out.println();
        System.out.println(cat.getName());
    }
}
