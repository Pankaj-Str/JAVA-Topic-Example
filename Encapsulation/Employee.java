package Encapsulation;

public class Employee{


    String name;
    int salary;
    String department;

    // create a constructor

    Employee(String Name, int Salary, String Department) {
        
        name = Name;
        salary = Salary;
        department = Department;

    }

    String get_name(){
        return name;
    }

    int get_salary(){
        return salary;
    }

    String get_department(){
        return department;
    }


    void set_name(String Name){
        name = Name;
    }

    void set_salary(int Salary){
        salary = Salary;
    }

    void set_department(String Department){
        department = Department;
    }


}