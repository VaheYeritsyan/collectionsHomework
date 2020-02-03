package collections;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private Integer age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static final Comparator<Student> FIRST_NAME_COMPARATOR = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getFirstName().toLowerCase().compareTo(s2.getFirstName().toLowerCase());
        }
    };
    public static final Comparator<Student> AGE_DESCENDING_COMPARATOR = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s2.getAge().compareTo(s1.getAge());
        }
    };

    @Override
    public int compareTo(Student student) {
        return this.lastName.toLowerCase().compareTo(student.getLastName().toLowerCase());
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
