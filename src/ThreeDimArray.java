import java.util.Scanner;

public class ThreeDimArray {
    public static void main(String[] args) {
        int[][][] arr = new int[2][3][4];
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the school and marks of students");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {

                    System.out.println("enter marks of school" +" "+ i + "class "+" "+j+" student is" + " "+k);
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("marks are as follows");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]+" ");

                }
                System.out.println();
            }
        }
    }
}
