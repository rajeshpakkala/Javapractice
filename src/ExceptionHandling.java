import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[]args){
        try {
            System.out.println("connection is established");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter num1");
            int num1 = sc.nextInt();
            System.out.println("enter num2");
            int num2 = sc.nextInt();
            int c = num1 / num2;
            System.out.println("result is"+c);
            System.out.println("if error occurs in above print c statment then the below code is not executed at any cost");

        }
        catch(ArithmeticException e){
            System.out.println("zero div error & enter proper values ");
        }
        try {
            Scanner sc1=new Scanner(System.in);
            System.out.println("enter d value ");
            int d=sc1.nextInt();
            System.out.println("enter e value ");
            int e=sc1.nextInt();
            int k=d/e;
            System.out.println("result is"+k);
            System.out.println("connection is terminated");
        }
        catch (Exception ef){
            System.out.println("you entered a wrong output");
        }
        System.out.println("out of blocks");
    }
}
