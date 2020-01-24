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
        DynamicArray dynamicArray=new DynamicArray(5);
        dynamicArray.add(vahe);
        dynamicArray.add(armen);
        dynamicArray.add(narek);
        dynamicArray.add(tigran);
        System.out.println("Displaying dynamic array");
        dynamicArray.display();

        //creating doubly linked list
        DoublyLinkedList linkedList=new DoublyLinkedList();
        linkedList.addLast(vahe);
        linkedList.push(armen);
        linkedList.push(tigran);
        linkedList.addLast(narek);
        System.out.println("Displaying doubly linked list");
        linkedList.display();


//        ArrayList<Student> students = new ArrayList<>(List.of(
//                vahe, armen, tigran, narek
//        ));
//        DynamicArray dynamicArray=new DynamicArray(2);
//        System.out.println("Initial size "+dynamicArray.getSize());
//        System.out.println("Initial capacity "+dynamicArray.getCapacity());
//        dynamicArray.add(vahe);
//        dynamicArray.add(tigran);
//        dynamicArray.add(armen);
//        System.out.println("dynamicArray.remove(armen) = " + dynamicArray.remove(tigran));
//        dynamicArray.display();

//        System.out.println("Before sorting");
//        printArray(students);
//        System.out.println("Sorting by it's natural sorting (Lastname asc)");
//        Collections.sort(students);
//        printArray(students);
//        System.out.println("Sorting by firstName asc)");
//        Collections.sort(students, Student.FirstNameSort);
//        printArray(students);
//        System.out.println("Sorting by age desc)");
//        Collections.sort(students, Student.AgeDescendingSort);
//        printArray(students);
//        System.out.println("Adding the items to linked list");
//        Collections.sort(students);
//        LinkedList<Student> studentsOrdered = new LinkedList<>(students);
//        printArray(studentsOrdered);
//        DoublyLinkedList linkedList = new DoublyLinkedList();
//        linkedList.addLast(vahe);
//        linkedList.addLast(armen);
//        linkedList.addLast(tigran);
//        linkedList.addLast(narek);
//        System.out.println("and so the linked list is");
//        linkedList.display();
//        System.out.println("Removing first element");
//        System.out.println("linkedList.pop() = " + linkedList.pop());
//        linkedList.display();
//        System.out.println("Removing last element");
//        System.out.println("linkedList.removeLast() = " + linkedList.removeLast());
//        linkedList.display();
//        System.out.println("linkedList.pop() = " + linkedList.pop());
//        linkedList.display();
//        System.out.println("linkedList.pop() = " + linkedList.pop());
//        linkedList.display();
//        System.out.println("linkedList.pop() = " + linkedList.pop());
//        linkedList.display();
//        System.out.println("linkedList.pop() = " + linkedList.pop());
    }

    private static void printArray(List<Student> students) {
        for (Student student : students) {
            System.out.println("student = " + student);
        }
    }
}
