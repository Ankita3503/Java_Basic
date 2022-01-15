import java.util.Scanner;

public class Button_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the button:");
        int button = sc.nextInt();
        switch (button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namste");
                break;
            case 3:
                System.out.println("hola");
                break;
            default:
                System.out.println("Press the invalid key");
        }
    }
}