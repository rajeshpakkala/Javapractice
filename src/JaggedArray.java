import java.util.Scanner;

public class JaggedArray {
    public static void main(String[]args){
        int [][]arr=new int[3][];
        Scanner sc=new Scanner(System.in);
        arr[0]=new int[3];
        arr[1]=new int[4];
        arr[2]=new int[5];
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("student class is" + i + " student is" + " " + j);
                arr[i][j] = sc.nextInt();
            }
        }
            System.out.println("student marks are as follows");
            for( int i=0;i< arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

    }
}
