package p1;
//if class have a abstract method then we mandatory to create class is an abstract..

abstract class Person {
    public int age ;
    public String name;


    //to reduce the reedundancy we make a constructer
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
