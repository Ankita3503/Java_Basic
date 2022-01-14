import java.util.Scanner;

public class Half_Pyramid_With_Numbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the No of row's:");
        int n= sc.nextInt();
        //Outer loop
        for (int i = 1; i <=n; i++) {
            //Inner loop
            for (int j = 1; j <=i ; j++) {
                //print the number's i.e 1 to 5 countinuous
                System.out.print(j+" ");
//                if we print the i variable the ouput should be
//                1
//                22
//                333
//                4444
//                55555
            }
            System.out.println();
        }
    }
}