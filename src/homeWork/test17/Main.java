package homeWork.test17;

public class Main {
    public static void main(String[] args) {
        MyIntArray array = new MyIntArray();
        System.out.println(array.size());
        array.addToTail(4);
        array.print();
        System.out.println();
        array.addToHead(8);
        array.print();
        System.out.println();
        array.get(0);
        array.insertAfter(0,7);
        array.print();
    }
}
