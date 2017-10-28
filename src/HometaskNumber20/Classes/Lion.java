package HometaskNumber20.Classes;

import HometaskNumber20.Abstracts.WildAnimal;

public class Lion extends WildAnimal {
    public Lion(int age, int weight, String color) {
        super(age, weight, color);
        this.isPredator = true;
        id++;
    }

    @Override
    public String makeSound() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.makeSound());
        stringBuilder.append("\n I am lion");
        if(isPredator ==true) {
            stringBuilder.append("\n I  am predator");
        }

        String message = stringBuilder.toString();
        return message;
    }
}
