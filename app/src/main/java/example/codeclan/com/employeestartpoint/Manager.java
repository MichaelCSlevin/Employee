package example.codeclan.com.employeestartpoint;

/**
 * Created by michaelslevin on 24/10/2017.
 */

public class Manager extends Employee {

    private String deptName;

    public Manager (String deptName){

        this.deptName = deptName();
    }


    public int getID(){
        return super.getId();
    }

    public String getName() {
        return super.getName();
    }

    public double getSalary(){
        return super.getSalary();
    }

    public String getSocialSecurityNumber(){
        return super.getSocialSecurityNumber();
    }

    public String getDeptName(){
        return this.deptName;
    }
}
