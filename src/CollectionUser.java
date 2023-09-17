import java.util.ArrayList;
import java.util.Scanner;

public class CollectionUser {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> num=new ArrayList<>();
        System.out.println("enter no of elements");
        int input=sc.nextInt();
        sc.nextLine();
     for(int i=0;i<input;i++){
         System.out.println("enter elements"+i+" ");
       String user=sc.nextLine();
       num.add(user);
     }
     for(String output:num){
         System.out.println("elements are"+output);
     }
        System.out.println();
    }
}
