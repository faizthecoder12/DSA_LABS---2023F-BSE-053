//SearchInArray
import java.util.Arrays;
public class Lab6_Task2 {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 6, 7, 2, 10, 1, 4, 9};
        int target = 7;

        int index = Arrays.binarySearch(numbers, target);
        if (index >= 0) {
            System.out.println(target + " found at index " + index);
        } else {
            System.out.println(target + " not found.");
        }
    }
}
