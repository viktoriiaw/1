package homeWork.test7;

public class Main {
    public static void main(String[] args) {
        Person name = new Person();
        Person age = new Person();
        Person gender = new Person();
        Person yearOfBirth = new Person();

        name.setName("Vasya");
        age.setAge(12);
        gender.setGender("M");
        yearOfBirth.setYearOfBirth(1981);

        System.out.println(name.getName());
        System.out.println(age.getAge());
        System.out.println(gender.getGender());
        System.out.println(yearOfBirth.getYearOfBirth());
    }
}
