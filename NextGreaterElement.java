import java.util.*;

public class NextGreaterElement {
    public static int[] nextGreater(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); // Default no greater element
        Deque<Integer> stack = new ArrayDeque<>(); // Store indexes

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[i] > nums[(Integer)stack.peek()]) {
                result[(Integer)stack.pop()] = nums[i];
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        System.out.println("Next Greater Elements: " + Arrays.toString(nextGreater(arr)));
    }
}
