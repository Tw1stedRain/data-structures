import java.util.Arrays;

public class Array_reverse {
    public static void main(String[] args) {
        int[] newArray = {1, 2, 3, 4, 5};
        int[] newArray1 = {7, 2, 13, 24, 54};
        int[] newArray2 = {11, 2, 27, 33, 47, 65};
        reverseArray(newArray);

        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(newArray1));
        System.out.println(Arrays.toString(newArray2));
    }

    public static int[] reverseArray(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}
