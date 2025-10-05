public class CountSetBits {
    public static void main(String[] args) {
        int n = 9;
        int count = 0;

        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }

        System.out.println("Set Bits: " + count);
    }
}
