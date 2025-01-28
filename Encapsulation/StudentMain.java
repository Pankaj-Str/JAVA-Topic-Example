package Encapsulation;

public class StudentMain {

    public static void main(String[] args) {
        
        // create a student object
        Students student = new Students("John", 20);
        
        // get the student name and age
        System.out.println("Student name: " + student.getStudentName());
        System.out.println("Student age: " + student.getStudentAge());

        // update student name 
        student.setStudentName("Jane");
        System.out.println("Updated student name: " + student.getStudentName());
    }
    
}
