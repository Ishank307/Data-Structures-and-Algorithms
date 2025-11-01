package String;

import java.util.HashMap;

class Solution1 {
    public boolean isIsomorphic(String s, String t) {

        // Step 1: Length check
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Create a HashMap to map characters from s → t
        HashMap<Character, Character> res = new HashMap<>();

        // Step 3: Traverse both strings
        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            // If this character mapping hasn't been seen before
            if (!res.containsKey(original)) {
                // If the replacement char is already used for another mapping, fail
                if (res.containsValue(replacement)) {
                    return false;
                }
                // Otherwise, map it
                res.put(original, replacement);
            }
            // If this character mapping already exists, verify consistency
            else {
                char check = res.get(original);
                if (check != replacement) {
                    return false;
                }
            }
        }

        // Step 4: If no inconsistencies found
        return true;
    }

    // Boilerplate main method for testing

}

public class IsomorphicString {

    public static void main(String[] args) {
        Solution1 sol = new Solution1();

        System.out.println(sol.isIsomorphic("egg", "add")); // true
        System.out.println(sol.isIsomorphic("foo", "bar")); // false
        System.out.println(sol.isIsomorphic("paper", "title")); // true
        System.out.println(sol.isIsomorphic("ab", "aa")); // false
    }
}
