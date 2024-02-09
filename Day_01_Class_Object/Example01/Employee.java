public class Employee {
    
    


    // basic = without args. and without return type.
    void get_info(){
        System.out.println("Employee Name : joy");
    }
    // without args and with return type.

    int get_price(){

        return 999;
    }

    String get_city(){

        return "mumbai";
    }

    float get_height(){

        return 5.6f;
    }

    // without return type and with args.

    void get_salary(int salary,int leave){
        int oneDaySalary = salary/30;
        int leave_amount = oneDaySalary*leave;
        int final_salary = salary - leave_amount;

        System.out.println("---------Salary---------------");
        System.out.println("Monthly Salary : "+salary);
        System.out.println("leave : "+leave);
        System.out.println("leave amount : "+leave_amount);
        System.out.println("Pay Salary : "+final_salary);
        System.out.println("------------------------");

    }

    // with return type and with args.

    int get_result(int number1,int number2){

        int result = number1 + number2;
        
        return result;
    }

}
