import java.util.Scanner;

public class JaggedTwodim {
    public static void main(String[] args) {
        int[][] arr = new int[2][];
        Scanner sc = new Scanner(System.in);
        arr[0] = new int[3];
        arr[1] = new int[4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("student of the class" + " " + i + " " + "student is" + " " + j +" "+"marks is");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("student marks are as follows");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

