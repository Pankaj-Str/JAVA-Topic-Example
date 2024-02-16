package Day_03;
class This_keyword{
        String name;
        int age;
        void set_value(String name , int age ){

                this.name = name;
                this.age = age;
        }
        void get_value(){

            System.out.println("your name is : "+name);
            System.out.println("your age is : "+age);

        }
        public static void main(String[] args) {
            This_keyword obj = new This_keyword();
            obj.set_value("joy", 12);
            obj.get_value();
        }
}