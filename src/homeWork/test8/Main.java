package homeWork.test8;

import homeWork.test6.Dog;

public class Main {
    public static void main(String[] args) {
        Person name = new Person();
        Person age = new Person();
        Person gender = new Person();
        Person yearOfBirth = new Person();
        Dog dog = new Dog();


        name.setName("Vasya");
        age.setAge(12);
        gender.setGender("M");
        yearOfBirth.setYearOfBirth(1981);
        dog.setName("Тузик");
        dog.setAge(5);

        System.out.println(name.getName());
        System.out.println(age.getAge());
        System.out.println(gender.getGender());
        System.out.println(yearOfBirth.getYearOfBirth());
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
    }
}
