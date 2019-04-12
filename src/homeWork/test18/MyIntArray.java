package homeWork.test18;

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

    public void addToHead(int b) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        newArray[0] = b;
        array = newArray;
    }

    public int get(int index) {
        if (index <= array.length) {
            System.out.println("под индексом " + index + " - " + array[index]);
        } else System.out.println("индекс за границами массива");
        return index;
    }

    public void insertAfter(int index, int a) {
        if (index <= array.length) {
            int[] newArray = new int[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[index + 1] = a;
            for (int i = index + 2; i < newArray.length; i++) {
                newArray[i] = array[i - 1];
            }
            array = newArray;

        } else System.out.println("индекс за границами массива");
    }

    public void insertBefore(int index, int a) {
        if (index <= array.length) {
            int[] newArray = new int[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = a;
            for (int i = index + 1; i < newArray.length; i++) {
                newArray[i] = array[i - 1];
            }
            array = newArray;
        } else System.out.println("индекс за границами массива");
    }
}
