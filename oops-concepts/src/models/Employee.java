package models;

public class Employee extends Person {


    private double salary;

    public Employee(String name, String tech, String address, double salary) {
        super(name, tech, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display(){
        System.out.println("Bang Bang");
    }

}
