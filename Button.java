import java.util.Scanner;

public class Button {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1 or 2 or 3.");
        int button= sc.nextInt();
        if(button==1) System.out.println("Hello");
        else if(button==2) System.out.println("Nameste");
        else if (button==3)System.out.println("Hola");
        else System.out.println("sorry button is not exist's.3");
    }
}
