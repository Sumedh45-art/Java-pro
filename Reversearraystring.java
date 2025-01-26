import java.util.*;

public class ReverseArrString {

    public static void ReverseArr(String[] arr) {
        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String arr[] = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextLine();
        }
        System.err.println("original array: " + Arrays.toString(arr));
        ReverseArr(arr);
        System.err.println("reversed array: " + Arrays.toString(arr));
        scanner.close();
    }
}
