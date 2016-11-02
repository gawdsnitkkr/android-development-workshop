package company;

import employee.Employee;

public class Main {

    public static void main(String[] args) {

        Employee divya = new Employee(2000000);
        Employee kaushik = new Employee(2000000);
        Employee rewanth = new Employee(2000000);
        Employee anshul = new Employee(2000000);

        // Class Variables are accessed through the class and not its instances.
        System.out.println(String.format("Number Of Employees : %d", Employee.count));

        // Instance Variables are accessed through instances if they are public.
        divya.salary += 100000;

        System.out.println(divya.toString());

    }

}
