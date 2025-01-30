package OOP.PERSON;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstname(String firstName) {
        if (firstName == null) {
            throw new NullPointerException("firstName cannot be null!");
        }

        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            throw new NullPointerException("lastName cannot be null!");
        }

        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalStateException("age must be between 0 and 120!");
        }

        this.age = age;
    }

    public void printPersonInfo() {
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Age: " + this.age);
        System.out.println();
    }
}
