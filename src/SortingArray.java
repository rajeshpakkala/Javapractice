import java.util.Arrays;

public class SortingArray {
    public static void main(String[]args) {
        int[] arr = {2, 3, 4, 5, 5, 5, 66, 6, 677, 55, 5, 444};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println(arr.getClass().getName());

    }
}
