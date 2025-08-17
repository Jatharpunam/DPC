public class FindDuplicateNumber {

    public static int findDuplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];         
            fast = arr[arr[fast]];     
        } while (slow != fast);

        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow; 
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {1, 3, 4, 2, 2};
        System.out.println("Test Case 1: Duplicate number = " + findDuplicate(arr1));

        // Test Case 2
        int[] arr2 = {3, 1, 3, 4, 2};
        System.out.println("Test Case 2: Duplicate number = " + findDuplicate(arr2));

        // Test Case 3
        int[] arr3 = {1, 1};
        System.out.println("Test Case 3: Duplicate number = " + findDuplicate(arr3));

        // Test Case 4
        int[] arr4 = {1, 4, 4, 2, 3};
        System.out.println("Test Case 4: Duplicate number = " + findDuplicate(arr4));

        // Test Case 5 (large input: [1, 2, 3, ..., 99999, 50000])
        int[] arr5 = generateLargeTestCase();
        System.out.println("Test Case 5: Duplicate number = " + findDuplicate(arr5));
    }

    private static int[] generateLargeTestCase() {
        int n = 100000;  
        int[] arr = new int[n];

        for (int i = 1; i < n; i++) {
            arr[i - 1] = i;
        }

        arr[n - 1] = 50000;

        return arr;
    }
}
