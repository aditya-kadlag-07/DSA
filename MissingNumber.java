public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5; // should contain 1 to 5
        int sum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) actualSum += num;
        System.out.println("Missing Number: " + (sum - actualSum));
    }
}
