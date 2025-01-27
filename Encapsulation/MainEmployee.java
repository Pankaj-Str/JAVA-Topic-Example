package Encapsulation;

public class MainEmployee {

        public static void main(String[] args) {

            // create an object of Employee

            Employee employee = new Employee("John", 50000, "IT");

            // get the values using get methods

            System.out.println("Name: " + employee.get_name());
            System.out.println("Salary: " + employee.get_salary());
            System.out.println("Department: " + employee.get_department());

            // update salary 

            employee.set_salary(60000);

            // get the updated salary
            System.out.println("Updated Salary: " + employee.get_salary());


        }

}