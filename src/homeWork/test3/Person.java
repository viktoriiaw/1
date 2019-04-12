package homeWork.test3;

public class Person {
    public String name;
    public int age;
    public String gender;
    public int yearOfBirth;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void print (){
    System.out.println("Имя " + name);
    System.out.println(age);
    System.out.println(gender);
    System.out.println(yearOfBirth);
}
}
