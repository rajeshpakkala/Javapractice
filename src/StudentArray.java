import java.util.*;
class Student{

    String name;
    int age;
}
public class StudentArray {
    public static void main(String[]args){
       Student []st=new Student[3];

      st[0]=new Student();
       st[1]=new Student();
       st[2]=new Student();
       st[0].name="rajesh";
       st[0].age=24;

        st[1].name="surendra";
        st[1].age=22;

        st[2].name="prasad";
        st[2].age=21;
       for(int i=0;i<st.length;i++){

           System.out.println(st[0].name + " "+st[0].age);
       }
        for(int i=0;i<st.length;i++){
            System.out.println(st[1].name + " "+st[1].age);
        }
        for(int i=0;i<st.length;i++){
            System.out.println(st[2].name + " "+st[2].age);
        }
        for(Student ele:st){
            System.out.println(ele);
        }

    }
}

