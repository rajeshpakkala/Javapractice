import java.util.Scanner;

public class SingleThread {
public static void main(String[]args){
    System.out.println("process started");
    int acc=1234;
    int pass=5678;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter account number");
    acc=sc.nextInt();
    System.out.println("Enter password");
    pass=sc.nextInt();
    if(acc==1234 && pass==5678){
        System.out.println("collect your cash");
    }
    else{
        System.out.println("hacker");
    }

    System.out.println("Printing numbers");
    for(int i=1;i<=5;i++){
        System.out.println(i);
    }
    System.out.println("printing alphabets");
    for(int i=65;i<=70;i++){
        System.out.println((char)(i));
    }


}
}
