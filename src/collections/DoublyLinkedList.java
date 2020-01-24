package collections;

import java.util.NoSuchElementException;

public class DoublyLinkedList{
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void push(Student student){
        Node newNode=new Node(student);
        newNode.setNext(head);
        if(isEmpty()){
            tail=newNode;
        }else{
            head.setPrevious(newNode);
        }
        head=newNode;
        size++;
    }
    public void addLast(Student student){
        Node newNode=new Node(student);
        newNode.setPrevious(tail);
        if(isEmpty()){
            head=newNode;
        }else{
            tail.setNext(newNode);
        }
        tail=newNode;
        size++;
    }
    public Student pop(){
        if(isEmpty()){
            throw new NoSuchElementException("The list is empty");
        }
        if(head.getNext()==null){
            tail=null;
        }else{
            head.getNext().setPrevious(null);
        }
        Node firstNode=head;
        head=head.getNext();
        firstNode.setNext(null);
        size--;
        return firstNode.getValue();
    }
    public Student removeLast(){
        if(isEmpty()){
            throw new NoSuchElementException("The list is empty");
        }
        if(tail.getPrevious()==null){
            head=null;
        }else{
            tail.getPrevious().setNext(null);
        }

        Node lastNode=tail;
        tail=tail.getPrevious();
        lastNode.setPrevious(null);
        size--;
        return lastNode.getValue();
    }
    public void display(){
        Node current=head;
        while (current!=null){
            System.out.println(current.getValue().getFirstName()+" "+
                    current.getValue().getLastName());
            current=current.getNext();
        }
    }
}