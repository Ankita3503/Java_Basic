package p1;

public class Stu extends Person{
    int marks;
    int rollno;

    public Stu(int marks, int rollno,int age,String name) {
        super(age, name);      //child class se imidiate parent class ke constructer ko invoke karega
        // super statement be the first line

        this.marks = marks;
        this.rollno = rollno;
//        this.age=age;         to solve the redundancy of code we use super statement
//        this.name=name;
    }

}
