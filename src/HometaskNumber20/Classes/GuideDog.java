package HometaskNumber20.Classes;

public class GuideDog extends Dog {
    private boolean isTrained;

    public GuideDog(int age, int weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(age, weight, color, name, isVaccinated);
        id++;
        this.isVaccinated = isVaccinated;
        this.isTrained = isTrained;

    }

    @Override
    public String makeSound() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(super.makeSound());
      String message = super.makeSound();
//        System.out.println(message);
        return message;

    }

    public void takeHome(){
        if(isTrained==true&&isVaccinated==true){
        }
        System.out.println("I am trained and I can take you home");
       System.out.println("=======================================");
    }
}
