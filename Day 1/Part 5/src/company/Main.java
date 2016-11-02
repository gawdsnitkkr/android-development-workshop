package company;

import employee.*;

public class Main {

    public static void main(String[] args) {

        /*

            Employee anonymous = new Employee(2000000);

            The above statement will produce an error because abstract classes cannot be instantiated like normal
            classes in a future part we look in to this effect. The same is applicable for the Developer class.
         */

        // Runtime Polymorphism
        Employee divya = new WebDeveloper("Divya", 2000000);
        Developer anshul = new AndroidDeveloper("Anshul", 2000000);

        System.out.println(divya.toString());
        System.out.println(anshul.toString());

    }

}
