package HometaskNumber21;




import java.nio.channels.NotYetBoundException;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
     MyCollection collection = new MyCollection(5);
        System.out.println("Is collections  empty? - "+collection.isEmpty());
     Person person = new Person("Ananiy", 87);
     Person person1 = new Person("Akakiy", 97);
     Person person2 = new Person("Pedro", 45);
     Person person3 = new Person("Hulio", 17);
     Person person4 = new Person("Antuan", 87);

        Person person5 = new Person("Arseniy", 87);
        Person person6 = new Person("Petro", 87);
        Person person7 = new Person("Bobby", 87);

     collection.add(person);
     collection.add(person1);
     collection.add(person2);
     collection.add(person3);
     collection.add(person4);


     MyCollection collection1 = new MyCollection(3);
     collection1.add(person5);
     collection1.add(person6);
     collection1.add(person7);

        System.out.println("Array number one: "+ Arrays.toString(collection.container));
        System.out.println("Array number two: "+ Arrays.toString(collection1.container));

        collection.retainAll(collection1);

        System.out.println("Array number one: "+ Arrays.toString(collection.container));


        System.out.println("Does collection contain object "+person2+"? - "+collection.contains(person2) );

        collection.remove(person2);

        System.out.println("Does collection contains object "+person2+"? - "+collection.contains(person2) );

        collection.addAll(collection1);

        System.out.println("Array number one: "+ Arrays.toString(collection.container));
        System.out.println("Current capacity: "+collection.container.length);

        System.out.println("Current state of collection number one: "+ Arrays.toString(collection.container));
        System.out.println("Current state of collection1: "+ Arrays.toString(collection1.container));

 //       System.out.println("Does collection contain another collection?" +collection.containsAll(collection1));

        collection.clear();

        System.out.println("Array number one after clearing: "+ Arrays.toString(collection.container));

        collection.addAll(collection1);

        System.out.println("Array number one: "+ Arrays.toString(collection.container));

        collection.add(person);
        collection.add(person1);
        collection.add(person2);
        collection.add(person3);
        collection.add(person4);
        collection1.add(person5);
//        collection1.add(person6);
        collection1.add(person7);

        System.out.println("Current state of collection: "+ Arrays.toString(collection.container));


        System.out.println("Does collection number one contain all of collection number two? - "+collection.containsAll(collection1));

        collection.removeAll(collection1);

        System.out.println("Array number one after deleting all elements of collection number two: "+ Arrays.toString(collection.container));


    }
}
