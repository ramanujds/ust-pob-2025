//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello everyone");
        System.out.println("Let's try some math operations");
        int a=10, b=2;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        try {
            int output1 = a / b;
            System.out.println("a / b = " + output1);
        }
        catch (ArithmeticException ex){
            System.out.println("Division unsuccessful.. Cannot divide by zero");
        }
        int output2 = a*b;
        System.out.println("a x b = "+output2);
        System.out.println("Operations Done");
        System.out.println("Thank You");
        System.out.println("Bye..");


    }
}