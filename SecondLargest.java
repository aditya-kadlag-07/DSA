public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 50, 23, 90};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println("Second Largest: " + second);
    }
}
