package OOP.STUDENT;

import java.util.List;

public class StudentUsage {
    public static void main(String[] args) {
        Student student = new Student("Akaki", "Burjanadze", 19, 3.5, true, "Computer Science");

        student.addSubject("Computer Architecture");
        student.addSubject("Discrete Structures");
        student.addSubject("Introduction to Informatics 1");
        student.addSubject("Fundamentals of Programming");

        System.out.println("Student details: ");
        System.out.println("First name: " + student.getFirstName());
        System.out.println("Last name: " + student.getLastName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Gpa: " + student.getGpa());
        System.out.println("Student status: " + student.getStudentStatus());
        System.out.println("Major: " + student.getMajor());

        List<String> subjects = student.getSubjects();

        System.out.println("Subjects: ");
        for (String subject : subjects) {
            System.out.println(subject);
        }
    }
}
