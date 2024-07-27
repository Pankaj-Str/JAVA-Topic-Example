package Day_09;

class Employee_p4n{

        String name[];
        double salary[];
        String designation[];

        Employee_p4n(String[] Name, double[] Salary, String[] Designation) {
                name = Name;
                salary = Salary;
                designation = Designation;
        }

        void get_all_data(){

                int size = name.length;
                System.out.println("Sn.no. | Name | Salary | Designation");
                for (int i = 0; i < size; i++) {

                        
                        System.out.println(i+1+" | "+name[i]+" | "+salary[i]+" | "+designation[i]);
                        
                }

        }

        




}