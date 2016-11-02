package employee;

/**
 * Created by Divya Mamgai on 10/31/2016.
 * AndroidDeveloper
 */

/*
    Interfaces cannot be extended instead they are implemented, i.e., there abstract methods' bodies are implemented.
    And every method declared in the interface is needed to be implemented.
    The same can be said for the WebDeveloper class.
    Note: You can chain extends and implements operator together but implements should come after extends.
 */

public class AndroidDeveloper extends Employee implements Developer {

    public AndroidDeveloper(String name, float salary) {
        super(name, salary);
    }

    public AndroidDeveloper(float salary) {
        super(salary);
    }

    @Override
    public String toString() {
        return String.format("I'm %s an Android Developer having salary Rs. %1f", name, salary);
    }

    @Override
    public void develop() {
        System.out.println("I just developed an Android App!");
    }

}
