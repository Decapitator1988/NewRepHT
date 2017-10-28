package HometaskNumber24;


public class LinkedListQueue {
   private Node  head;
   private Node tail;
   private int num;

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void add (String data) {
        Node currentNode = new Node(data);
       if(head==null){
        head = currentNode;
        tail = head;
        num++;
        return;
       }
       currentNode.setPrev(tail);
       tail.setNext(currentNode);
       tail = currentNode;
       num++;
    }
    public Node poll() {
        Node pollingNode = head;
        Node currentNode = head.getNext();
        head.setNext(null);
        head = currentNode;
        currentNode.setPrev(null);
        num--;
        return pollingNode;
    }
    public Node peek(){
        return head;
    }

    public int size(){
        return num;
    }

    }




