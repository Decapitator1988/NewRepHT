package HometaskNumber20.Classes;

import HometaskNumber20.Abstracts.DomesticAnimal;

public class Dog extends DomesticAnimal {
    private String name;
    public Dog(int age, int weight, String color, String name, boolean isVaccinated){
        super(age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
        id++;
    }
    public String makeSound(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.makeSound());
        stringBuilder.append("\n I am a dog");
        stringBuilder.append(" and my name is "+name);
        stringBuilder.append("\n \t Woof!");
        if(isVaccinated==true) {
            stringBuilder.append("\n I am vaccinated");

        }

        String message = stringBuilder.toString();
        System.out.println(message);
        return message;
    }
}
