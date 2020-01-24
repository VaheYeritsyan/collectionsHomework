package collections;

public class DynamicArray {
    private Student[] array;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size=0;
        this.array=new Student[capacity];
    }
    public DynamicArray() {
        this.capacity = 10;
        this.size=0;
        this.array=new Student[capacity];
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
    public boolean add(Student student){
        if(student==null){
            return false;
        }

        if(isFull()){
            extendArray();
        }
        array[size]=student;
        size++;
        return true;
    }

    private boolean isFull() {
        return size==capacity;
    }

    private void extendArray() {
        capacity*=2;
        Student[] newArray=new Student[capacity];
        for (int i = 0; i < array.length; i++) {
            newArray[i]=array[i];
        }
        array=newArray;
    }
    public Student get(int index){
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }
    public boolean remove(Student student){
        int indexFound=-1;
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(student)){
                indexFound=i;
                break;
            }
        }
        if(indexFound==-1){
            return false;
        }
        size--;
        Student[] copyArray=new Student[capacity];
        for (int i = 0; i < size; i++) {
            if(i<indexFound){
                copyArray[i]=array[i];
            }else {
                copyArray[i]=array[i+1];
            }
        }
        array=copyArray;
        return true;

    }
    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(array[i].getFirstName()+" "+
                    array[i].getLastName());
        }
    }


}
