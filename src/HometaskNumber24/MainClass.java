package HometaskNumber24;


public class MainClass {
    public static void main(String[] args) {
        LinkedListQueue linkedListQueue = new LinkedListQueue();
        linkedListQueue.add("A");
        linkedListQueue.add("B");
        linkedListQueue.add("C");
        linkedListQueue.add("D");
        linkedListQueue.add("E");


        showLinkedListQueue(linkedListQueue);


        linkedListQueue.poll();
        linkedListQueue.poll();

        linkedListQueue.add("AA");
        linkedListQueue.add("XX");
        linkedListQueue.poll();


        showLinkedListQueue(linkedListQueue);
        System.out.println("The peek is: "+linkedListQueue.peek());

        linkedListQueue.poll();
        linkedListQueue.poll();

        showLinkedListQueue(linkedListQueue);
        System.out.println("current size is "+linkedListQueue.size());
        System.out.println();
        System.out.println("polled element " +linkedListQueue.poll());
    }

    public static void showLinkedListQueue(LinkedListQueue linkedListQueue) {
        Node currentNode = linkedListQueue.getHead();
        System.out.println("\n Current values: ");
        while (currentNode != null) {
            System.out.print("\t"+ currentNode.getData()+"  ");
            currentNode = currentNode.getNext();
        }
        System.out.println();
        System.out.println("Current size of the list is "+linkedListQueue.size());
        System.out.println("Current Head-node of the list is: "+linkedListQueue.getHead());
        System.out.println("Current Tail-mode of the list is: "+linkedListQueue.getTail());
    }
}