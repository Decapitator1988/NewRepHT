package HometaskNumber27;

import HometaskNumber13.Array;

import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MainClass {


    public static void main(String[] args) {

        List<Person> list = Arrays.asList(
                new Person("Alvaro Recoba"),
                new Person("Andreas Iniesta"),
                new Person("Pablo Esconar"),
                new Person("Andre Pirlo"),
                new Person("Oliver Bierhovv"),
                new Person("Alvaro Recoba"),
                new Person("Ryan Giggs")
                );
        showMiddleAgePerson(list, (p) -> p.getAge()>25&&p.getAge()<45);
        Stream<Person> personStream =  list.stream();
        System.out.println(personStream.count());
        showPersonStartsNameWithA(personStream);

//
//        Person person1 = new Person("Cristiano Romnaldo");
//        Person person2 = new Person("Andreas Iniesta");
//        Person person3 = new Person("Pablo Esconar");
//        Person person4 = new Person("Andre Pirlo");
//        Person person5 = new Person("Rivaldo");
//        Person person6 = new Person("Oliver Bierhovv");
//        Person person7 = new Person("Oliver Kahn");
//        Person person8 = new Person("David Backham");
//        Person person9 = new Person("Ryan Giggs");

    }
    public static void showMiddleAgePerson(List<Person> list, Predicate<Person> predicate){
        for (Person p: list ) {
            if(predicate.test(p)){
                System.out.println(p + " ");
            }
        }
        System.out.println();
    }

    public static void showPersonStartsNameWithA(Stream<Person> streamm){

        streamm.filter(person -> person.getName().startsWith("A"))
                .forEach(person ->  );
    }
}
