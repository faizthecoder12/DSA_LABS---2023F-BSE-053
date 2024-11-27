//FirstOccurrence
public class Lab6_Task4 {
    public static int findFirstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1; // Search in the left half
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 6, 8, 10};
        int target = 4;
        System.out.println("First Occurrence Index: " + findFirstOccurrence(arr, target));
    }
}
