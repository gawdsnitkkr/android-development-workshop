package employee;

/**
 * Created by Divya Mamgai on 10/31/2016.
 * Developer
 */
public abstract class Developer extends Employee {

    public Developer(String name, float salary) {
        super(name, salary);
    }

    public Developer(float salary) {
        super(salary);
    }

    public void develop() {
        System.out.println("I just developed something!");
    }

}
