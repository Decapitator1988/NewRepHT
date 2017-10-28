package HometaskNumber23;


public class MainClass {
    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.insertAfter("A");
        linkedList.insertAfter("B");
        linkedList.insertAfter("C");
        linkedList.insertAfter("D");
        linkedList.insertAfter("E");
        linkedList.insertAfter("F");
        linkedList.insertAfter("G");
        linkedList.insertAfter("Nobody is perfect");

        linkedList.remove("A");
        linkedList.remove("B");
        linkedList.remove(linkedList.getHead());

        System.out.println(linkedList.contains("A"));
        System.out.println(linkedList.contains("B"));
        System.out.println(linkedList.contains("C"));
        System.out.println(linkedList.contains("E"));

        System.out.println();
        linkedList.showList();
        System.out.println();

        System.out.println("A current size of container is: "+ linkedList.size(linkedList));

        System.out.println("The Head-element element in container is: "+ linkedList.getHead());
        System.out.println("The Tail-element in container is: "+linkedList.getTail());

    }
}
