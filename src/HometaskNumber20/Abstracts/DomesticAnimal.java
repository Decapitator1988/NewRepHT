package HometaskNumber20.Abstracts;

public abstract  class DomesticAnimal extends Animal {
    protected String name;
    protected boolean isVaccinated;


    public DomesticAnimal(int age, int weight, String color) {
        super(age, weight, color);
        this.isVaccinated = false;
    }


    public String getName() {
        return name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    @Override
    public String makeSound() {
//        String meeting = "Hello ";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.meeting);
        stringBuilder.append("\n I am Domestic animal ");
       String message = stringBuilder.toString();
             return message;
    }
}
