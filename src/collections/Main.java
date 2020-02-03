package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student vahe = new Student("Vahe", "Yeritsyan", 18);
        Student armen = new Student("Armen", "Barseghyan", 27);
        Student tigran = new Student("Tigran", "Aslanyan", 9);
        Student narek = new Student("Narek", "Vahanyan", 25);

        //adding to dynamic array
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(vahe);

        dynamicArray.add(armen);
        dynamicArray.add(narek);
        dynamicArray.add(tigran);
        System.out.println("Displaying dynamic array");
        dynamicArray.display();

        //creating doubly linked list
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.addLast(vahe);
        linkedList.push(armen);
        linkedList.push(tigran);
        linkedList.addLast(narek);
        System.out.println("Displaying doubly linked list");
        linkedList.display();


    }

    private static void printArray(List<Student> students) {
        for (Student student : students) {
            System.out.println("student = " + student);
        }
    }
}
