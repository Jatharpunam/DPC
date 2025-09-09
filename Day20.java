import java.util.Stack;

public class SortStackRec {
    static void sort(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int x = st.pop();
            sort(st);
            insert(st, x);
        }
    }

    static void insert(Stack<Integer> st, int x) {
        if (st.isEmpty() || st.lastElement() <= x) {  
            st.push(x);
        } else {
            int y = st.pop();
            insert(st, x);
            st.push(y);
        }
    }

    public static void main(String[] args) {
        test(new int[]{7, 1, 5});           
        test(new int[]{5});                 
        test(new int[]{-3, 14, 8, 2});      
        test(new int[]{});                  
        test(new int[]{3, 3, 3});          
    }

    static void test(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int x : arr) st.push(x);
        sort(st);
        System.out.println(st);
    }
}
