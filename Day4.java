public class MergeTwoSortedArrays {

    static void merge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        int i = m - 1;  
        int j = 0;     

        while (i >= 0 && j < n && arr1[i] > arr2[j]) {
            int temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
            i--;
            j++;
        }

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
    }

    static int[] generateArr1_case5() {
        int[] arr1 = new int[50000]; 
        for (int i = 0; i < 50000; i++) {
            arr1[i] = i + 1; 
        }
        return arr1;
    }

    static int[] generateArr2_case5() {
        int[] arr2 = new int[50000]; 
        for (int i = 0; i < 50000; i++) {
            arr2[i] = 50001 + i; 
        }
        return arr2;
    }

    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        merge(arr1, arr2);
        System.out.println("Test Case 1:");
        System.out.print("arr1 = ");
        printArray(arr1);
        System.out.print("arr2 = ");
        printArray(arr2);
        System.out.println();

        // Test Case 2
        arr1 = new int[]{1, 3, 5};
        arr2 = new int[]{10, 12, 14};
        merge(arr1, arr2);
        System.out.println("Test Case 2:");
        System.out.print("arr1 = ");
        printArray(arr1);
        System.out.print("arr2 = ");
        printArray(arr2);
        System.out.println();

        // Test Case 3
        arr1 = new int[]{2, 3, 4};
        arr2 = new int[]{6, 8, 10};
        merge(arr1, arr2);
        System.out.println("Test Case 3:");
        System.out.print("arr1 = ");
        printArray(arr1);
        System.out.print("arr2 = ");
        printArray(arr2);
        System.out.println();

        // Test Case 4
        arr1 = new int[]{1};
        arr2 = new int[]{2};
        merge(arr1, arr2);
        System.out.println("Test Case 4:");
        System.out.print("arr1 = ");
        printArray(arr1);
        System.out.print("arr2 = ");
        printArray(arr2);
        System.out.println();

        // Test Case 5
        arr1 = generateArr1_case5();
        arr2 = generateArr2_case5();
        merge(arr1, arr2);
        System.out.println("Test Case 5:");
        System.out.println("arr1 first element = " + arr1[0] + ", last element = " + arr1[arr1.length - 1]);
        System.out.println("arr2 first element = " + arr2[0] + ", last element = " + arr2[arr2.length - 1]);
    }
}
