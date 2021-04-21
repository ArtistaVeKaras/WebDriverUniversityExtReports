package javaBasics.inheritance;

public class Person {

    private String name;
    private String gender;
    private int age;

    public Person(){
        System.out.println("In the Person default constructor");
    }

    public Person(String name){
        System.out.println("in the 2dn constructor. Name is set");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
