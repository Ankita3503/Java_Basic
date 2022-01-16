import javax.print.attribute.IntegerSyntax;

public class WrapperAutoBoxingExa {
    public static void main(String[] args) {
        int a =57;

        //Convert the Integer wrapper classe by explicitly
        Integer b=Integer.valueOf(a);

//        Convert the Wrapper classe(Integer) by internally
        Integer c=a;
        System.out.println(a+" "+b+" "+c);
    }
}
