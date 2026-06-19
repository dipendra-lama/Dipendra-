public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        // Add elements of first array
        for (int num : arr1) {
            set.add(num);
        }

        // Find common elements
        for (int num : arr2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        System.out.print("Intersection of Arrays: ");

        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
