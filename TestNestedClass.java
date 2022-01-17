class Outer{
     static int num1;
    Outer(){
        num1=10;
    }
    //Create the Static inner class
   static class Inner{
        int num2;
        Inner(){
            num2=20;
        }
        public void display(){
            System.out.println(num1);//to access the num1 variable u should must declare as Static..
            System.out.println(num2);
        }//end of the display method

    }//end of the inner class
}//end of the outer class

public class TestNestedClass {
    public static void main(String[] args) {

        //for access the num2 variable
        Outer.Inner obj=new Outer.Inner();
        obj.display();

        //for access the num1 variable
        Outer obj2=new Outer();
        System.out.println(obj2.num1);
    }//end of the main method.
}//end of the main class
