import java.util.Scanner;

public class ArrayeleException {
    public static void main(String[]args){
        try {
            System.out.println("connection is established");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter size of an array");
            int size = sc.nextInt();
            int[] a = new int[size];
            System.out.println("enter element to be inserted");
            int elem = sc.nextInt();
            System.out.println("enter position to be inserted");
            int pos = sc.nextInt();
            a[pos] = elem;
            System.out.println(a[pos]);
            System.out.println("connection terminated");
        }
        catch (NullPointerException e){
            System.out.println("enter proper value");
        }
        catch (ArrayIndexOutOfBoundsException ar){
            System.out.println("Be in your limits & array bounds range crosses");
        }
        System.out.println("out of code");

    }

}
