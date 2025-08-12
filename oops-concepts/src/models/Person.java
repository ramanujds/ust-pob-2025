package models;

public abstract class Person {

    private String name;
    private String tech;
    private String address;

    public Person(){

    }

    public Person(String name, String tech, String address) {
        this.name = name;
        this.tech = tech;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract void display();

}
