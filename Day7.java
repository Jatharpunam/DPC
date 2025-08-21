public class TrappingRainWater {

    static int trap(int[] height) {
        int n = height.length;
        if (n < 3) return 0; 

        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left]; 
                } else {
                    water += leftMax - height[left]; 
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right]; 
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] h1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Output: " + trap(h1)); 

        int[] h2 = {4, 2, 0, 3, 2, 5};
        System.out.println("Output: " + trap(h2)); 

        int[] h3 = {1, 1, 1};
        System.out.println("Output: " + trap(h3)); 

        int[] h4 = {5};
        System.out.println("Output: " + trap(h4)); 

        int[] h5 = {2, 0, 2};
        System.out.println("Output: " + trap(h5)); 
    }
}
