package Day_05;

public class Compile_Time_Polymorphism {

    void get_info(){

        System.out.println("welcome to p4n");

    }

    void get_info(String msg){

        System.out.println("welcome : "+msg);

    }

    void get_info(int pin){

        System.out.println("Pin ID : "+pin);

    }

    public static void main(String[] args) {
        Compile_Time_Polymorphism ctp = new Compile_Time_Polymorphism();
        ctp.get_info();
        ctp.get_info(306702);
        ctp.get_info("Welcome to CWP");
    }


    
}
