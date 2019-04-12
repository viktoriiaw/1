package homeWork.test16;

public class Main {
    public static void main(String[] args) {
        MyIntArray array = new MyIntArray();
        System.out.println(array.size());
        System.out.println();
        array.addToTail(7);
        array.print();
        System.out.println();
        array.addToHead(5);
        array.print();
        System.out.println();
        array.get(1);
    }
}
