package homeWork.test3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person age = new Person();
        Person gender = new Person();
        Person yearOfBirth = new Person();

        person.setName("Vasya");
        age.setAge(12);
        gender.setGender("M");
        yearOfBirth.setYearOfBirth(1981);

        person.print();
        age.print();
        gender.print();
        yearOfBirth.print();
    }
}
