//Write a class MathOperation which accepts 5 integers through command line.
//class Create an array using these parameters. Loop through the array and
//        obtain the sum and average of all the elements and display the result.
//        Various exceptions that may arise like ArithmeticException,
//        NumberFormatException, and so on should be handled.
import java.util.InputMismatchException;
import java.util.Scanner;
public class MathOperation {
    public static void main(String[] args) {
        int j=0;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        try{
            for (int i = 0; i < 5; i++){
                a[i]=sc.nextInt();
                j=j+a[i];
            }
            
            double d=j/5;
            System.out.println("The Avg of the :"+d);
            System.out.println("The Sum of the element :"+j);
        }catch (ArithmeticException obj){
            System.out.println(obj);
        }catch (InputMismatchException obj2){
            System.out.println(obj2);
        }
    }
}



