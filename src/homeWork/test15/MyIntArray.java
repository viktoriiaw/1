package homeWork.test15;

public class MyIntArray {
    private int [] array = new int[0];

    MyIntArray () {

    }
    public int size() {
        return array.length;
    }
    public void print () {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
    public  void addToTail ( int a) {
        int [] newArray = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            array[i] = newArray[i];
        }
        newArray[array.length] = a;
        array = newArray;
    }
    public void addToHead (int a) {
        int [] newArray = new int[array.length+1];
        for (int i = 0; i < array.length ; i++) {
            newArray[i+1] = array [i] ;
        }
        newArray[0] = a;
        array = newArray;
    }
}
