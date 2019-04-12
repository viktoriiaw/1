package homeWork.test2;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog age = new Dog();
        dog.setName("Тузик");
        age.setAge(5);

        System.out.println(dog.getName());
        System.out.println(age.getAge());
    }
}
