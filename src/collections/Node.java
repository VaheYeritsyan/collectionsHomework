package collections;

public class Node {
    private Node previous;
    private Node next;
    private Student value;

    public Node(Student value) {
        this.value = value;
        previous=next=null;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Student getValue() {
        return value;
    }
}

