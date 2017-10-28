package HometaskNumber20.Classes;

import HometaskNumber20.Abstracts.DomesticAnimal;

public class Hamster extends DomesticAnimal {

    public Hamster(int age, int weight, String color, String name, boolean  isVaccinated) {
        super(age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
        id++;
    }

    @Override
    public String makeSound() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.makeSound());
        stringBuilder.append("\n I am a hamster");
        stringBuilder.append("\n My name is "+getName());

        String message = stringBuilder.toString();
        System.out.println(message);
        return message;
    }
}
