package models;

public class Student extends Person {
    private String grade;


    public Student(String name, String tech, String address, String grade) {
        super(name, tech, address);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    public void display() {
        System.out.println("Play Bold");
    }
}
