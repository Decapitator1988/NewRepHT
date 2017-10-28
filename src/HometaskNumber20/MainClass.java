package HometaskNumber20;

import HometaskNumber20.Classes.*;

public class MainClass {


    public static void main(String[] args) {


        Cat cat = new Cat(5, 8, "White", "Sofokl", true);
        cat.makeSound();

        Cat cat0  =new Cat( 4, 7, "Black", "Kikky", false);
        cat0.makeSound();


        Crocodile gennadiy = new Crocodile( 3, 100, "Green");
        gennadiy.makeSound();

        Dog dog = new Dog(12, 4,  "Grey", "Sam", true);
        dog.makeSound();
//
        Giraffe giraffe = new Giraffe(49, 120, "brown with spots");
        giraffe.makeSound();

        Hamster hamster = new Hamster( 666, 5,  "white-brown", "Piotr", false);
        hamster.makeSound();

        GuideDog guideDog = new GuideDog( 5, 45, "Blue", "Chappie", true, true);
        guideDog.makeSound();
        guideDog.takeHome();

        Fish fish = new Fish( 1, 10, "Red", "Nemo");
        fish.makeSound();

        Wolf wolf = new Wolf(11, 60, "Grey ");
        wolf.makeSound();

    }

}
