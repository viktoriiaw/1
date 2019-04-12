package homeWork.test14;

public class MyIntArray {
    private int[] array = new int[0];

    MyIntArray() {
    }

    public int size() {
        return array.length;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public void addToTail(int a) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = a;
        array = newArray;
    }
}

