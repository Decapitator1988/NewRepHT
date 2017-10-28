package HometaskNumber20.Classes;

import HometaskNumber20.Abstracts.WildAnimal;

public class Crocodile extends WildAnimal {
    private boolean isPredator;

    public Crocodile(int age, int weight, String color){

        super(age, weight, color);
        this.isPredator = true;
        id++;


    }
        public String makeSound(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.makeSound());
        stringBuilder.append("\n I am a crocodile ");
        if(isPredator==true){
            stringBuilder.append("\n And I am a predator");
        }

        String message = stringBuilder.toString();
            System.out.println(message);
        return message;

        }
    }

