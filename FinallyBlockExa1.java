public class FinallyBlockExa1 {
    public static void main(String[] args) {
        try{
            System.out.println("Try block");
            System.out.println(50/5);
        }
        //The controll is not goto the catch block
        catch (ArithmeticException obj){
            System.out.println(obj);
        }
        finally {
            System.out.println("Finally block is always executed");
        }
    }
}
