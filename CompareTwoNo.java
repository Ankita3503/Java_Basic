import java.util.Scanner;

public class CompareTwoNo {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first no.");
       int a= sc.nextInt();
       System.out.println("Enter the second no.");
       int b= sc.nextInt();
        if (a == b)
            System.out.println("Number is equal.");
        else if (a<b)
            System.out.println("B is greater than A");
        else
            System.out.println("A is greater than B");
    }
}
