//SmallestMissingPositive
import java.util.Arrays;
public class Lab6_Task3 {
    public static int findSmallestMissingPositive(int[] arr) {
        Arrays.sort(arr);
        int smallestMissing = 1;

        for (int num : arr) {
            if (num == smallestMissing) {
                smallestMissing++;
            }
        }
        return smallestMissing;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("Smallest Missing Positive: " + findSmallestMissingPositive(arr));
    }
}
