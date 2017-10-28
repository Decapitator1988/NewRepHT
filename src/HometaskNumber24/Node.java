package HometaskNumber24;

public class Node {
    private String data;
    private Node prev;
    private Node next;

    public Node(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data;
    }

    public String getData() {
        return data;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
