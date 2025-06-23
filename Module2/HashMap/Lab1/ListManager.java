package Module2.HashMap.Lab1;

import java.util.HashMap;

public class ListManager {

    // Map to store students by their last name
    private HashMap<String, Student> studentsMap = new HashMap<>();

    // Constructor to initialize the map with students
    public ListManager(Student[] students) {
        for (Student student : students) {
            studentsMap.put(student.lastName, student);
        }
    }

    // List all students in the waiting list
    public void listStudents() {
        if (studentsMap.isEmpty()) {
            System.out.println("The system has no students in the waiting list");
            return;
        }

        System.out.println("Listing all Students\n");
        for (Student student : studentsMap.values()) {
            System.out.println(student);
        }
    }

    // Find and display a student by last name
    public void findStudent(String lastName) {
        if (!studentsMap.containsKey(lastName)) {
            System.out.println("\nStudent with name '" + lastName + "' does not exist.");
            return;
        }

        Student student = studentsMap.get(lastName);
        System.out.println("Student Found\n");
        System.out.println(student);
    }

    // Update the status of a student
    public void updateStudentStatus(String lastName, String newStatus) {
        Student student = studentsMap.get(lastName);
        if (student == null) {
            System.out.println("\nStudent does not exist. Status was not updated.");
            return;
        }

        String oldStatus = student.status;
        student.status = newStatus;
        System.out.println("\nStudent (" + lastName + ") status was changed from '"
                + oldStatus + "' to '" + newStatus + "'");
    }

    // Remove a student by last name
    public void removeStudent(String lastName) {
        Student removedStudent = studentsMap.remove(lastName);
        if (removedStudent == null) {
            System.out.println("\nStudent was not removed.");
            return;
        }

        System.out.println("\nStudent removed.");
        System.out.println(removedStudent);
    }
}

