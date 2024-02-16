class BasicMain{

    public static void main(String[] args){

        // System.out.println("codeswithpankaj");

        // create an object : 

        // ClassName ObjectName = new ClassName()

        Employee emp = new Employee();
        emp.get_info();
        emp.get_salary(56000, 7);
        emp.get_salary(56000, 3);

        System.out.println("Your City Name is : "+emp.get_city());
        System.out.println("Your height Name is : "+emp.get_height());
        System.out.println("Your price Name is : "+emp.get_price());
        System.out.println("this is result : "+emp.get_result(700,800));

    }

}