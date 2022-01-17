package p1;
public class Emp extends Person{
    int id;
    int sal;

    public Emp(int id,int sal,int age,String name) {
        super(age, name);
        
        // what the perpose of super-->to perform constructer chaining between classes
        // we can use it inside the constructer not any method

        this.id=id;
        this.sal=sal;
//        this.age=age;
//        this.name=name;
    }
}
