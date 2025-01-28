package Encapsulation;

public class Students {
    String Student_name;
    int Student_age;

    Students(String name, int age) {
        Student_name = name;
        Student_age = age;
    }

    String getStudentName(){
        return Student_name;
    }

    int getStudentAge(){
        return Student_age;
    }

    void setStudentName(String name){
        Student_name = name;
    }

    void setStudentAge(int age){
        Student_age = age;
    }

}
