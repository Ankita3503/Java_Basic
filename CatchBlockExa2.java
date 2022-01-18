public class CatchBlockExa2 {
    public static void main(String[] args) {
        try{
            int arr[]={1,2,3};
            System.out.println(arr[7]);
            // if you provide the correct index of the array the compiler not
//            go to the catch block
        }
        catch(ArrayIndexOutOfBoundsException obj){
            System.out.println(obj);// print the exception description
        }

        System.out.println("rest of the code");
    }
}
