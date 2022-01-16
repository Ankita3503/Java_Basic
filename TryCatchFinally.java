public class TryCatchFinally {
    public static void main(String[] args) {
        int a = 20, b = 0;
        try {

            System.out.println("Value of a: " + a);
            System.out.println("Value of b: " + b);
            int div = a / b;
            System.out.println("Division: " + div);
        } catch (NullPointerException npe) {
            System.out.println(npe); // prints corresponding exception.
        } finally {
            System.out.println("Denominator cannot be zero");
        }
        System.out.println("Hello Java");
    }
}
// output is -
//Value of a: 20
//Value of b: 0
//Denominator cannot be zero
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at TryCatchFinally.main(TryCatchFinally.java:7)
