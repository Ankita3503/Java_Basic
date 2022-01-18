public class MultiCatchBlock {
    public static void main(String[] args) {
        try {
            int arr[]=new int [5];
            arr[4]=50/0;
        }
        catch (ArithmeticException obj){
            System.out.println("Arithmetic Excepotion Occur");
        }
        catch(ArrayIndexOutOfBoundsException obj1){
            System.out.println("Array Exception Occur");
        }
        catch(Exception obj2){
            System.out.println(" Parent Exception Occur");
        }
    }
}
