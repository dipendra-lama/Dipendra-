
import java.util.LinkedHashSet;
public class UnionOfArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Add elements of first array
        for (int num : arr1) {
            set.add(num);
        }

        // Add elements of second array
        for (int num : arr2) {
            set.add(num);
        }

        System.out.print("Union of Arrays: ");

        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}