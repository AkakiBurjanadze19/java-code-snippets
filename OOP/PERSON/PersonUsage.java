package OOP.PERSON;

import java.util.ArrayList;
import java.util.List;

public class PersonUsage {
    public static void main(String[] args) {
        Person person1 = new Person("Akaki", "Burjanadze", 16);
        Person person2 = new Person("Luka", "Burjanadze", 17);

        System.out.println("First person: ");
        System.out.println("First name: " + person1.getFirstName());
        System.out.println("Last name: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        person1.setAge(19);
        System.out.println("Updated age: " + person1.getAge());

        System.out.println();

        System.out.println("Second person: ");
        System.out.println("First name: " + person2.getFirstName());
        System.out.println("Last name: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        person2.setAge(19);
        System.out.println("Updated age: " + person2.getAge());

        System.out.println();

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(new Person("Alex", "Samanishvili", 20));
        persons.add(new Person("Mathew", "Dunkin", 16));
        persons.add(new Person("Lucy", "Smith", 21));

        System.out.println("Persons: ");
        for (Person person : persons) {
            person.printPersonInfo();
        }
    }
}
