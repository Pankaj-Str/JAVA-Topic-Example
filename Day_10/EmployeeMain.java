package Day_10;

class EmployeeMain{


    public static void main(String[] args) {
     
        Employees emps = new Employees("Joy",45000.89);
        System.out.println(emps.get_name());
        System.out.println(emps.get_salary());
    }
}