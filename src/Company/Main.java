package Company;

public class Main {
    public static void main(String[] args) {
        Employee emily = new Employee("Emily", "Finance", 50000);
        Manager john = new Manager("John", "IT", 75000, 5);
        Intern dave = new Intern("Dave", "Marketing", 30000, "State University");

        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);


        Director fajri = new Director("salem", "Finance", 50000 , 100000 );
        Engineer salem = new Engineer("salem", "Finance", 50000 , new String[]{
                "coding" , "hacking"
        } );
        SalesPerson khalid = new SalesPerson("salem", "Finance", 50000 , 300000 );

        System.out.println(fajri);
        System.out.println(salem);
        System.out.println(khalid);



    }
}