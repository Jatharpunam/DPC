public class MissingNumber {
    
    public static long findMissingNumber(int[] arr, int n) {
        long expectedSum = (long) n * (n + 1) / 2;
        
        long actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {1, 2, 4, 5};
        System.out.println("Test Case 1: Missing number = " + findMissingNumber(arr1, 5));

        // Test Case 2
        int[] arr2 = {2, 3, 4, 5};
        System.out.println("Test Case 2: Missing number = " + findMissingNumber(arr2, 5));

        // Test Case 3
        int[] arr3 = {1, 2, 3, 4};
        System.out.println("Test Case 3: Missing number = " + findMissingNumber(arr3, 5));

        // Test Case 4
        int[] arr4 = {1};
        System.out.println("Test Case 4: Missing number = " + findMissingNumber(arr4, 2));

        // Test Case 5
        int n = 1_000_000; 
        int[] arr5 = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            arr5[i] = i + 1; 
        }
        System.out.println("Test Case 5: Missing number = " + findMissingNumber(arr5, n));
    }
}
