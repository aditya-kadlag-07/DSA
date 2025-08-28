public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        int start = 0, end = str.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome)
            System.out.println(str + " is a Palindrome");
        else
            System.out.println(str + " is NOT a Palindrome");
    }
}
