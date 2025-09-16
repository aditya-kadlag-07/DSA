import java.util.*;

public class FirstNonRepeating {
    public static char findChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '_'; // No non-repeating found
    }

    public static void main(String[] args) {
        String s = "aabbcde";
        System.out.println("First non-repeating: " + findChar(s));
    }
}
