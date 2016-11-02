package employee;

/**
 * Created by Divya Mamgai on 10/31/2016.
 * Developer
 */
public class Developer extends Employee {

    public Developer(String name, float salary) {
        super(name, salary);
    }

    public Developer(float salary) {
        super(salary);
    }

    public void develop() {
        System.out.println("I just developed something!");
    }

    /*
        This is a typical case of Method Overriding.
        Note : "@Override" annotation (optional) is used to explicitly let Java Compiler know that this is method is
               override and hence it will check for Method Prototype to match that of the Parent Class.
        It is not applicable in the static methods of a class because they are not bounded by the instance rather by
        the classes themselves as discussed in Part 2.
     */
    @Override
    public String toString() {
        return String.format("I'm %s a Developer having salary Rs. %1f", name, salary);
    }

}
