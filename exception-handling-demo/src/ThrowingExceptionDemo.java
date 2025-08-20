public class ThrowingExceptionDemo {

    static double getSqrt(double num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("Negative input not allowed");
        }
        return Math.sqrt(num);
    }

    public static void main(String[] args) {

        double num = -16;
        try {
            double sqrt = getSqrt(num);
            System.out.println(sqrt);
        }
        catch (NegativeNumberException ex){
            System.out.println("Error : "+ex.getMessage());
        }

    }

}
