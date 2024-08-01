package Day_10;

class Employees{
    String emp_name; 
    double salary;
    Employees(String emp_name,double salary){
        this.emp_name = emp_name;
        this.salary = salary;
    }
    String get_name(){
        return emp_name;
    }
    double get_salary(){
        return salary;
    }
    void set_name(String emp_name){
        this.emp_name = emp_name;
    }
    void set_salary(double salary){
        this.salary = salary;
    }

}