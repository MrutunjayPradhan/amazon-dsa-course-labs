package Module2.HashMap.Lab1;

public class WaitingList {

    public static void main(String[] args) {

        Student[] students = new Student[6];

        students[0] = new Student(1, "Bill", "Jones", "UNDER-REVIEW");
        students[1] = new Student(2, "John", "Smith", "UNDER-REVIEW");
        students[2] = new Student(3, "Wally", "Wiggles", "ENROLLED");
        students[3] = new Student(4, "May", "Hanks", "UNDER-REVIEW");
        students[4] = new Student(5, "Jane", "Carson", "UNDER-REVIEW");
        students[5] = new Student(6, "Lori", "Random", "UNDER-REVIEW");

        ListManager listManager = new ListManager(students);

        String studentLastName = "Carson";

        // Change this value to test different operations:
        // 1 - List all students
        // 2 - Find a student
        // 3 - Update student status
        // 4 - Remove a student
        int option = 4;

        System.out.println();
        switch (option) {
            case 1:
                listManager.listStudents();
                break;
            case 2:
                listManager.findStudent(studentLastName);
                break;
            case 3:
                listManager.updateStudentStatus(studentLastName, "ENROLLED");
                break;
            case 4:
                listManager.removeStudent(studentLastName);
                break;
            default:
                System.out.println("\nInvalid option selected.\n");
        }
        System.out.println();
    }
}
