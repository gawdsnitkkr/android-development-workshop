package employee;

/**
 * Created by Divya Mamgai on 10/31/2016.
 * AndroidDeveloper
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
        // See WebDeveloper.develop() for more details.
        new Thread(() -> {
            float percentage = 0;
            while (percentage < 100) {
                System.out.println(String.format("%s has developed %1.1f%% of the android app...", name, percentage));
                percentage += 7.5f;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(String.format("%s has completed development of the android app.", name));
        }).start();
    }

}
