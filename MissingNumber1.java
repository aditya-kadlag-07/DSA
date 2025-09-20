public class MissingNumber1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6};
        int n = 6; // range from 1 to n
        System.out.println("Missing Number: " + findMissing(nums, n));
    }

    static int findMissing(int[] nums, int n) {
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return total - sum;
    }
}
