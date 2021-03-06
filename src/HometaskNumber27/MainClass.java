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
                new Person("Stephen Gerard"),
                new Person("Clarense Seedorf"),
                new Person("Tony Kroos"),
                new Person("Tomas Muller"),
                new Person("Ashley Cole")
        );
        System.out.println("Persons with age over 25 and under 45: ");
        showMiddleAgePerson(list, (p) -> p.getAge() > 25 && p.getAge() < 45);
        Stream<Person> personStream = list.stream();

        System.out.println("Total number of persons: " + personStream.count());
        System.out.println();
        System.out.println("Persons, which name starts with letter A: ");
        showPersonStartsNameWithA(personStream, list);
    }

    private static void showMiddleAgePerson(List<Person> list, Predicate<Person> predicate) {
        for (Person p : list) {
            if (predicate.test(p)) {
                System.out.println(p + " ");
            }
        }
        System.out.println();


    }

    private static void showPersonStartsNameWithA(Stream<Person> stream, Collection<Person> collection) {
        collection.stream().filter(person -> person.getName().startsWith("A"))
                .forEach(System.out::println);
    }
}
