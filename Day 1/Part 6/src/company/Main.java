package company;

import employee.*;

public class Main {

    public static void main(String[] args) {

        /*

            Employee anonymous = new Employee(2000000);

            The above statement will produce an error because abstract classes cannot be instantiated like normal
            classes in a future part we look in to this effect. The same is applicable for the Developer class.
         */

        Developer divya = new WebDeveloper("Divya", 2000000);

        /*

            Why I can access toString() method of class WebDeveloper in the interface Developer?

            If an interface has no direct superinterfaces, then the interface implicitly declares a public abstract
            member method m with signature s, return type r, and throws clause t corresponding to each public instance
            method m with signature s, return type r, and throws clause t declared in Object, unless a method with the
            same signature, same return type, and a compatible throws clause is explicitly declared by the interface.

            [From Oracle DOCS : JLS §9.2 - Interface members]
            [Link : http://docs.oracle.com/javase/specs/jls/se7/html/jls-9.html#jls-9.2]

         */

        System.out.println(divya.toString());

        divya.develop();

    }

}
