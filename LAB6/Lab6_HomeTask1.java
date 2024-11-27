//BinarySearchInArray
public class Lab6_HomeTask1 {
    public static void main(String[] args) {
        int[] arr = {23,44,63,44,7,81,11,12,15,16,};
        int target = 16;

        int low = 0, high = arr.length - 1, result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                result = mid;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
