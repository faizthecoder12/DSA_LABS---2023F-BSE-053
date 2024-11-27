//DistinctOccurrences
import java.util.HashMap;

public class Lab6_HomeTask2 {
    public static void main(String[] args) {
        int[] A = {28, 1, 0, 1, 0, 3, 4, 0, 0, 3};
        HashMap<Integer, Integer> occurrences = new HashMap<>();

        for (int num : A) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        for (int key : occurrences.keySet()) {
            System.out.println(key + " " + occurrences.get(key));
        }
    }
}
