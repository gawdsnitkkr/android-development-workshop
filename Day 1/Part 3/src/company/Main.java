package company;

/*
    This imports all the classes and packages within the desired package.
 */

import employee.*;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee(2000000);
        Developer developer = new Developer(3000000);
        AndroidDeveloper androidDeveloper = new AndroidDeveloper(3000000);
        WebDeveloper webDeveloper = new WebDeveloper(3000000);
        Designer designer = new Designer(2500000);

        /*
            Inheritance Diagram
            Employee
                |- Developer
                    |- AndroidDeveloper
                    |- WebDeveloper
                |- Designer
         */

        System.out.println(employee.toString());
        System.out.println(developer.toString());
        System.out.println(androidDeveloper.toString());
        System.out.println(webDeveloper.toString());
        System.out.println(designer.toString());

        /*
            Runtime Polymorphism
            Super class can be assigned to its child classes but its instance cannot access child class specific
            members. Eg. : You cannot do the following -

                developerEmployee.develop();

            But you can do the following -

                developer.develop();

         */
        Employee developerEmployee = developer;
        System.out.println(developerEmployee.toString());

    }

}
