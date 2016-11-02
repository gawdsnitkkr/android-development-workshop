package employee;

/**
 * Created by Divya Mamgai on 10/31/2016.
 * Developer
 */
public class Developer extends Employee {

    /*
        In inheritance of a class with constructor(s) it is required to call there constructors in the inherited
        class at the fist statement in its constructor.
     */

    public Developer(float salary) {
        /*

            bool coffee = true;

            Using the above statement before super() call will generate an compile time error.

            Removing the following statement will make this class give error at compile time.
         */
        super(salary);
    }

    public void develop() {
        System.out.println("I just developed something!");
    }

    public String toString() {
        return String.format("I'm Developer having salary Rs. %1f", salary);
    }

}
