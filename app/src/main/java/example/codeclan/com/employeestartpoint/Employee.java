package example.codeclan.com.employeestartpoint;

import static android.R.attr.id;

/**
 * Created by user on 28/08/2017.
 */

public class Employee {
    private int id;
    private String name;
    private String socialSecurityNumber;
    private double salary;

    public Employee(int Id, String name, String socialSecurityNumber , double salary) {
        this.id = id;
        this.name = name;
        this.socialSecurityNumber;
        this.salary = salary;
    }



    public int getId() {

        return this.id;
    }



    public String getName() {

        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }


    public String getSocialSecurityNumber() {

        return this.socialSecurityNumber;
    }

    public double raiseSalary(int amount) {
        this.salary += amount;

    }

}
