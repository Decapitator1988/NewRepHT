package HometaskNumber20.Classes;

import HometaskNumber20.Abstracts.WildAnimal;

public class Wolf extends WildAnimal {

    public Wolf(int age, int weight, String color) {
        super(age, weight, color);
        this.isPredator = true;
        id++;
    }

    @Override
    public String makeSound() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.makeSound());
        stringBuilder.append("\n I am a wolf");
        if (isPredator == true) {
            stringBuilder.append("\n I am a predator");
        }

        String message = stringBuilder.toString();
        System.out.println(message);
        return message;
    }
}
