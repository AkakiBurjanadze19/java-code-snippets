package OOP.STUDENT;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;
    private boolean studentStatus;
    private String major;
    private List<String> subjects;

    public Student(String firstName, String lastName, int age, double gpa, boolean studentStatus, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.studentStatus = studentStatus;
        this.major = major;
        this.subjects = new ArrayList<>();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new NullPointerException("first name cannot be null!");
        }

        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            throw new NullPointerException("last name cannot be null!");
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

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        if (gpa < 0 || gpa > 4) {
            throw new IllegalStateException("gpa must be between 0 and 4");
        }

        this.gpa = gpa;
    }

    public boolean getStudentStatus() {
        return this.studentStatus;
    }

    public void setStudentStatus(boolean studentStatus) {
        this.studentStatus = studentStatus;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        if (major == null) {
            throw new NullPointerException("major cannot be null!");
        }

        this.major = major;
    }

    public void addSubject(String subject) {
        if (subject == null) {
            throw new NullPointerException("subject cannot be null!");
        }

        this.subjects.add(subject);
    }

    public List<String> getSubjects() {
        return this.subjects;
    }
}
