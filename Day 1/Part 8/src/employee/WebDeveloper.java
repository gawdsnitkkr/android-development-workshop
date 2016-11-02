package employee;

/**
 * Created by Divya Mamgai on 10/31/2016.
 * WebDeveloper
 */

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
        // See AndroidDeveloper for a short form of this known as lambda expression.
        new Thread(new Runnable() {
            @Override
            public void run() {
                float percentage = 0;
                while (percentage < 100) {
                    // "%1.1f" means to print the floating number with only one decimal place.
                    // "%%" is used to print a single % sign.
                    System.out.println(String.format("%s has developed %1.1f%% of the website...", name, percentage));
                    percentage += 7.5f;
                    try {
                        // Since Thread.sleep is prone to throw an error we need to surround it by Try Catch block
                        // to avoid compile time error.
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(String.format("%s has completed development of the website.", name));
            }
        }).start();
    }

}
