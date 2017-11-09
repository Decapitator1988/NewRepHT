package HometaskNumber27;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Person {
    private String name;
    private int age;
    List <Person> listOfPersons;

    public Person(String name) {
        this.name = name;
        final int min = 18;
        final int max = 65;
        final int rnd = rnd(min, max);
        this.age = rnd;
       listOfPersons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;

    }
    public static int rnd(int min, int max){
        max-= min;
        return (int) (Math.random()*++max)+min;
    }
    void adding(Person person){
        listOfPersons.add(person);
    }

    static void showMiddleAgePerson(List<Person>list){
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).age>25&&list.get(i).age<45){
                System.out.println(list.get(i));
        }

        }

    }



    @Override
    public String toString() {
        return name+", "+age;
    }
}
