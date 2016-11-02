package employee;

/**
 * Created by Divya Mamgai on 10/31/2016.
 * WebDeveloper
 */

// Refer AndroidDeveloper class for details on interface implementation.

public class WebDeveloper extends Employee implements Developer {

    public WebDeveloper(String name, float salary) {
        super(name, salary);
    }

    public WebDeveloper(float salary) {
        super(salary);
    }

    @Override
    public String toString() {
        return String.format("I'm %s an Web Developer having salary Rs. %1f", name, salary);
    }


    @Override
    public void develop() {
        System.out.println("I just developed a Website!");
    }

}
