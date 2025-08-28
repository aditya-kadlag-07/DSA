//Given a string, reverse it without using built-in reverse methods.

public class ReverseString {
    public static void main(String[] args) {
        String str = "Aditya";
        char[] arr = str.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reversed String: " + new String(arr));
    }
}
