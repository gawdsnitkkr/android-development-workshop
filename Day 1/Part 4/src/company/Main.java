package company;

import employee.*;

public class Main {

    public static void main(String[] args) {

        // Overloaded Constructor for Employee.
        Employee anonymous = new Employee(2000000);
        Developer divya = new Developer("Divya", 2000000);

        System.out.println(anonymous.toString());
        System.out.println(divya.toString());

    }

}
