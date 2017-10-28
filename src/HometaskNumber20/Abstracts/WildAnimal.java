package HometaskNumber20.Abstracts;

public abstract class WildAnimal extends Animal {

        protected boolean isPredator;

        public WildAnimal(int age, int weight, String color){
                super(age, weight, color);
        }

        public String makeSound(){
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(super.meeting);
                stringBuilder.append("\n I am a wild animal");
                if(isPredator ==true) {
                        stringBuilder.append("\n I am angry");
                }
                String message = stringBuilder.toString();
                return message;
        }
}
