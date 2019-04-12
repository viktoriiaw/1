package homeWork.test4;

import homeWork.test2.Dog;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        Person age = new Person();
        Person gender = new Person();
        Person yearOfBirth = new Person();
        Dog dog = new Dog();

        person.setName("Vasya");
        age.setAge(12);
        gender.setGender("M");
        yearOfBirth.setYearOfBirth(1981);
        dog.setName("Тузик");
        dog.setAge(5);

        System.out.println(person.getName());
        System.out.println(age.getAge());
        System.out.println(gender.getGender());
        System.out.println(yearOfBirth.getYearOfBirth());
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
    }

}
