package homeWork.test13;

public class MyIntArray {
    private int[] array = new int[2];

    MyIntArray() {
    }
    public int Size () {
        return array.length;
    }

    public void print () {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}




