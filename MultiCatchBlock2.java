import java.sql.SQLOutput;

public class MultiCatchBlock2 {

    public static void main(String[] args) {
        try{
        int a[]=new int[5];
            System.out.println(a[6]);
    }
        catch (ArithmeticException obj){
            System.out.println("Arithmetic Exception");
        }

        catch (ArrayIndexOutOfBoundsException obj1){
            System.out.println("Array Exception");
        }
        
        catch (Exception obj2){
            System.out.println("Parent class Exception");
        }
}
}
