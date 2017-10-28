package HometaskNumber23;



public class SingleLinkedList {
    private Node head;
    private Node tail;
    public static int nodeCounter = 0;



    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
    public Node find(String data){
        Node currentNode = head;
        do{
            if(currentNode.getData().equals(data)){
                return currentNode;
            }
                currentNode =currentNode.getNext();

        }while (currentNode!=null);
        return null;
    }
    public void insertAfter(String data){
        Node newCreatedNode = new Node(data);
        if(head==null){
            head = newCreatedNode;
            tail = head;
            nodeCounter++;
            return;
        }
        tail.setNext(newCreatedNode);
        tail = newCreatedNode;
        nodeCounter++;


    }
    public boolean contains(String data){
        return (find(data)!=null);
    }

    public void remove(String data){
        Node removingNode = find(data);
        remove(removingNode);
        }


    public void remove(Node removingNode){
        if(removingNode==null){
            System.out.println("Try again");
        return;
        }
        if(removingNode ==head){
            Node currentNode =head.getNext();
            head.setNext(null);
            head = currentNode;
            nodeCounter--;
        }
    }
    public void showList(){
        Node shownNode;
        Node headReserve = head;
        if(head!=null){
            shownNode=head;
            System.out.println(shownNode.getData());
        }
        for (int i = 1; i <nodeCounter-1 ; i++) {
            head = head.getNext();
            shownNode = head;
            System.out.println(shownNode.getData());
            if (shownNode.getNext() == tail) {
                System.out.println(tail.getData());
            }
        }
        head=headReserve;
    }
    public int size(SingleLinkedList list){
        return nodeCounter;
    }
}

