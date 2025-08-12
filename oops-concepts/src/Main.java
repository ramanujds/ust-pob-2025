import models.Person;
import models.Student;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Student("Ramanuj","DevOps","Bengaluru","A");

        System.out.println(person1.getName());

//        models.Employee emp1 = new models.Employee("Karan","Java","Mumbai",65000);


        person1.display();




    }

}
