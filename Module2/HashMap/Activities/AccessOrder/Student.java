package Module2.HashMap.Activities.AccessOrder;

public class Student {
    String studentId;
    String firstName;
    String lastName;
    String language;

    public Student(String studentId, String firstName, String lastName,String language){
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName=lastName;
        this.language = language;
    }

    @Override
    public String toString() {
      
        return firstName+" "+lastName;
    }
}
