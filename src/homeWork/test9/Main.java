package homeWork.test9;

import homeWork.test3.Person;

public class Main {
    public static void main(String[] args) {

        Bus seats = new Bus();
        Person driver = new Person();

        driver.setName("Vasya");
        driver.setAge(30);

        seats.setSeats(5);
        int a = seats.getSeats() - 1;

        System.out.println("Водитель - " + driver.getName() + ", "+ driver.getAge() + " лет");
        System.out.println("Свободных мест - " + a);
    }
}
