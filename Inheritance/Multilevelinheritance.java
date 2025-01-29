package Inheritance;


class Student{

    void info(){
        System.out.println("Student Info");
        System.out.println("Name: John Doe");
        System.out.println("Age: 20");
    }

}
class course extends Student{

    void courseinfo(){
        System.out.println("Course Info");
        System.out.println("Course: Computer Science");
        System.out.println("Year: 2020");
    }

}

class result extends course{

    void resultinfo(){
        System.out.println("Result Info");
        System.out.println("Marks: 90%");
        System.out.println("Grade: A");
    }

}




public class Multilevelinheritance {
    
    public static void main(String[] args) {
        result r = new result();
        r.info();
        r.courseinfo();
        r.resultinfo();
        }

}
