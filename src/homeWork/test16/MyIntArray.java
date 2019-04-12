package homeWork.test16;

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
            array[i] = newArray[i];
        }
        newArray[array.length] = a;
        array = newArray;
    }

    public void addToHead(int b) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        newArray[0] = b;
        array = newArray;
    }

    public int get(int index) {
        if (index < array.length) {
            System.out.print("index " + index + " = " + array[index]);
        } else System.out.println("индекс за границами массива");
        return index;
    }
}
