package HometaskNumber20.Classes;

import HometaskNumber20.Abstracts.WildAnimal;

public class Giraffe extends WildAnimal {

    public Giraffe(int age, int weight, String color) {
        super(age, weight, color);
        this.isPredator = false;
        id++;

        }




    @Override
    public String makeSound() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.makeSound());
        stringBuilder.append("\n I am giraffe");
        stringBuilder.append("\n i am not a predator");

        String message = stringBuilder.toString();
        System.out.println(message);
        return message;
    }
}
