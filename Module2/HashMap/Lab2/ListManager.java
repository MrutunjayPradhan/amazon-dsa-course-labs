package Module2.HashMap.Lab2;

// Task 1: Change the HashMap import into a tree map import

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ListManager {

    // Task 2: Change studentsMap from HashMap to TreeMap
    TreeMap<String,Student> studentsMap = new TreeMap<>();

    public ListManager(Student [] students){

        for (Student student : students) {
            studentsMap.put(student.lastName, student);
        }
    }
    
    @SuppressWarnings("unchecked")
    public void listStudents( ) {
        if(studentsMap.isEmpty()){
            System.out.println("The system has no students in the waiting list");
        } else {
            System.out.println("Listing all Students\n");
            @SuppressWarnings("rawtypes")
            Set entries = studentsMap.entrySet();
            for (Object entry : entries) {
                Map.Entry<String,Student> mapEntry = (Map.Entry<String,Student>) entry;
                Student student = (Student)mapEntry.getValue();
                System.out.println(student);
            }
        }

    }

    public void findStudent(String lastName) {
        if(studentsMap.containsKey(lastName)){
            System.out.println("Student Found\n");
            Student student = (Student)studentsMap.get(lastName);
            System.out.println(student);
        }else{
            System.out.println("\nStudent with name '" + lastName + "' Does not exist.");
        }

    }

    public void updateStudentStatus(String lastName, String newStatus){
        Student student = (Student)studentsMap.get(lastName);
        if(student != null){
            String oldStatus = student.status;
            student.status = newStatus;
            studentsMap.put(lastName,student);
            System.out.println();
            System.out.println("Student ("+ lastName +") status was changed from '" + oldStatus + "'' to '" + newStatus + "'");
            System.out.println(student);
        }else {
            System.out.println();
            System.out.println("Student does not exist. Status was not updated.");
        }
    }

    public void removeStudent(String lastName) {
        Student studentRemoved = (Student)studentsMap.remove(lastName);
        if(studentRemoved != null){
            System.out.println();
            System.out.println("Student removed.");
            System.out.println(studentRemoved);
            System.out.println();
        }else{
            System.out.println("Student was not removed.");
        }
    }


public void findFirstStudent(){

    // Task 3: Get the first Entry in studentsMap
    @SuppressWarnings("rawtypes")
    Map.Entry entry= (Map.Entry)studentsMap.firstEntry();
    /* Task 4: If the first entry exists, get the Student object
        from the entry */
    if(entry !=null){
        Student student = (Student) entry.getValue();
        if(student != null){

    // Task 5: If the Student is not null, print the Student object
        System.out.println("Student: "+student);
    // Task 6: If the Student is not null, return from the method.
        return;
        }
    }


    /* Task 7: If the first Entry doesn't exist or the Student is
        null, print an error message. */
    System.out.println("Missing data firstentry / student");

}

    public void findLastStudent(){

        // Task 9: Get the last Entry in studentsMap
        @SuppressWarnings("rawtypes")
        Map.Entry entry = (Map.Entry)studentsMap.lastEntry();

        /* Task 10: If the last entry exists, get the Student object
            from the entry */
        if(entry !=null){
            Student student = (Student) entry.getValue();
        // Task 11: If the Student is not null, print the Student object
            if(student != null){
        // Task 12: If the Student is not null, return from the method.
                System.out.println(student);
                return;
            }
        }



        /* Task 13: If the last Entry doesn't exist or the Student is
            null, print an error message. */
        System.out.println("Error: Missing lastEntry/student ");

    }

    public void findNextStudent(String searchString){

        // Task 15: Find the higher entry after the searchString
//        Student student = (Student)studentsMap.higherKey(searchString);
        @SuppressWarnings("rawtypes")
        Map.Entry entry = (Map.Entry )studentsMap.higherEntry(searchString);

        /* Task 16: If an entry is found, get the Student object
            from the entry */
        if(entry != null){
            Student student = (Student) entry.getValue();
            if(student !=null){
        // Task 17: If the student is not null, print the student
                System.out.println(student);
        // Task 18: If the Student is not null, return from the method
                return;
            }
        }



        /* Task 19: If the higher entry is not found or the
            student is null, print "Student not found." */
        System.out.println("Error: No Data found");

    }


    public void findPreviousStudent(String searchString) {

        // Task 22: Find the lower entry before the searchString
        @SuppressWarnings("rawtypes")
        Map.Entry entry =(Map.Entry) studentsMap.lowerEntry(searchString);
        // Task 23: If an entry is found, get the Student object
        if(entry != null){
            Student student = (Student) entry.getValue();
        /* Task 24: If the student is not null, print the student

        /* Task 25: If the Student is not null, return from the
             method.*/
            if(student != null){
                System.out.println(student);
                return;
            }
        }

        /* Task 26: If the lower entry is not found or the student is
            null, print "Student not found." */
        System.out.println("Error: Data not found");
    }
}



