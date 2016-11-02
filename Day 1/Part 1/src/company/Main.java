package company;

/*
    Java Packages are like namespaces in other languages and is used to bundle related classes together
    providing access protection and namespace management.
    It is a standard practice to keep package names in lower case inorder to avoid name conflict between classes
    which is evident in our example.
 */

import employee.Employee;

public class Main {

    public static void main(String[] args) {

        /*
            Employee is the class and employee is its instance or object.
         */

        Employee employee = new Employee(2000000);

        /*

            employee.salary += 1000000;

            The above statement will produce error because the default access specifier in Java only gives access to
            the member of the class in its package only and hence we will need to make it public if need to make it
            accessible to this package.

         */

        System.out.println(employee.toString());

    }

}
