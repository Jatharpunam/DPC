import java.util.*;

public class ZeroSumSubarrays {

    static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        int sum = 0;

        List<Integer> list0 = new ArrayList<>();
        list0.add(-1);
        map.put(0, list0);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  

            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
                map.get(sum).add(i); 
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(sum, list);
            }
        }

        return result;
    }

    static void printResult(List<int[]> result) {
        if (result.isEmpty()) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < result.size(); i++) {
            int[] pair = result.get(i);
            System.out.print("(" + pair[0] + ", " + pair[1] + ")");
            if (i < result.size() - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, -3, 3, -1, 2};
        System.out.print("Output: ");
        printResult(findZeroSumSubarrays(arr1)); 

        int[] arr2 = {4, -1, -3, 1, 2, -1};
        System.out.print("Output: ");
        printResult(findZeroSumSubarrays(arr2)); 

        int[] arr3 = {1, 2, 3, 4};
        System.out.print("Output: ");
        printResult(findZeroSumSubarrays(arr3)); 

        int[] arr4 = {0, 0, 0};
        System.out.print("Output: ");
        printResult(findZeroSumSubarrays(arr4));

        int[] arr5 = {-3, 1, 2, -3, 4, 0};
        System.out.print("Output: ");
        printResult(findZeroSumSubarrays(arr5)); 
    }
}
