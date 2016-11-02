package company;

import employee.*;

public class Main {

    public static void main(String[] args) {

        Employee divya = new Employee("Divya", 2000000) {

            @Override
            public String toString() {
                return String.format("I'm %s an Java Developer having salary Rs. %1f", name, salary);
            }

        };

        System.out.println(divya.toString());

    }

}