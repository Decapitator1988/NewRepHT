package HometaskNumber20.Classes;

import HometaskNumber20.Abstracts.DomesticAnimal;

public class Cat extends DomesticAnimal {


    public Cat(int age, int weight, String color, String name, boolean isVaccinated){
            super(age, weight,color);
            this.name = name;
            this.isVaccinated = isVaccinated;
            id++;
            setId(id);
        }

        public String  makeSound(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(super.makeSound());
        stringBuilder.append("\n I am Cat and my name is "+name);
        stringBuilder.append("\n \t Meow!");
        if(isVaccinated ==true) {
            stringBuilder.append("\n I am vaccinated");
        }

        String message = stringBuilder.toString();
            System.out.println(message);
            return message;
        }
}
