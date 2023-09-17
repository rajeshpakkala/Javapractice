import java.util.*;
import java.util.Collections.*;
class Student1 {
    private String name;
private int age;
    public Student1(String name) {
        this.name = name;
        this.age = 24;
    }
    public Student1() {
        this.name = "MOHAN";
        this.age = 24;
    }

    public Student1(int age) {
        name = "suresh";
        this.age = age;
    }
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }





    public void setname(String name) {
        this.name = name;

    }

    public String getname() {
        return name;
    }

    public String toString() {

        return name + " " + age;
    }
}
public class CollectionsObj {
    public static void main(String[]args){
        Student1 s1=new Student1(16);
        System.out.println(s1);
        Student1 s3=new Student1("rajesh");
        System.out.println(s3);
        Student1 s2=new Student1();
        System.out.println(s2);
              }
}
