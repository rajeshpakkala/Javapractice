import java.util.Scanner;
public class Array {
    public static void main(String[]args)
    {
        int []arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("enter marks of students"+i+" ");
            arr[i]=sc.nextInt();
        }
        System.out.println("student marks are as follows");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();

    }
}
