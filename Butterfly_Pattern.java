import java.util.Scanner;

public class Butterfly_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int n= sc.nextInt();
        // upper half
        for (int i = 1; i <=n ; i++) {
            //First part
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            //space
            int space=2*(n-i);
            for (int j = 1; j <=space ; j++) {
                System.out.print(" ");
            }
            //2nd part star
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower half
        for (int i = n; i >=1 ; i--) {
            //First part
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            //space
            int space=2*(n-i);
            for (int j = 1; j <=space ; j++) {
                System.out.print(" ");
            }
            //2nd part star
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
/*  o/p->
Entr the no. of rows:
5
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *

 */