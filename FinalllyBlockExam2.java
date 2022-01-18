public class FinalllyBlockExam2 {
    public static void main(String[] args) {
        try{
            System.out.println(25/0);
        }// It can only accept the null pointer exception
        //so control will not go the catch block
        catch (NullPointerException obj){
            System.out.println(obj);
        }

        finally {
            System.out.println("finally block is always ececuted..");
        }
    }
}
