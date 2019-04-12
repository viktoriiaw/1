package homeWork.test15;

public class Main {
    public static void main(String[] args) {
        MyIntArray array = new MyIntArray();
        System.out.println(array.size());
        array.addToTail(8);
        array.print();
        System.out.println();
        array.addToHead(4);
        array.print();
        System.out.println();
    }
}
