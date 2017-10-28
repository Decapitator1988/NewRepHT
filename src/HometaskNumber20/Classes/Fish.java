package HometaskNumber20.Classes;

import HometaskNumber20.Abstracts.DomesticAnimal;

public class Fish extends DomesticAnimal {
    public Fish(int age, int weight, String color, String name) {
        super(age, weight, color);
        this.name = name;
        this.isVaccinated = false;
        id++;
           }

    @Override
    public String makeSound() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n Sorry. man, I am fish, I cannot speak");

        String message = stringBuilder.toString();
        System.out.println(message);
        return message;
        }
}
