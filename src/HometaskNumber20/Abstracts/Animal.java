package HometaskNumber20.Abstracts;

public abstract class  Animal {
    private int age;
    private int weight;
    private String color;

    public static int id=0;


    public void setId(int id) {
        this.id = id;
    }

    public Animal(int age, int weight, String color) {
        System.out.println("=======================================");
        System.out.println("Animal with id :"+id);
        this.age = age;
        this.weight = weight;
        this.color = color;


    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }



    public String meeting = "Hello! ";
    public abstract String   makeSound();

}
