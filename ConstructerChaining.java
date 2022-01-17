class Stu{
    int rollno;
    String name;
    public Stu() {
        System.out.println("This is non-parameterize constructer");
    }

    public Stu(int rollno,String name){
        this();
        System.out.println("THis is parametrize constructer");
    }
}

public class ConstructerChaining {
    public static void main(String[] args) {Stu obj=new Stu(69,"Yash Gupta.");
        //Stu obj1=new Stu();
        Stu obj2=new Stu(69,"Yash Gupta.");

    }
}
