package String;

public class reverseString {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example test cases
        String s1 = "the sky is blue";
        String s2 = "  hello world  ";
        String s3 = "a good   example";

        System.out.println(sol.reverseWords(s1)); // Expected: "blue is sky the"
        System.out.println(sol.reverseWords(s2)); // Expected: "world hello"
        System.out.println(sol.reverseWords(s3)); // Expected: "example good a"
    }
}

class Solution {
    public String reverseWords(String s) {
        String sTrimmed=s.trim();
        String[] words=sTrimmed.split("\\s+");
        StringBuilder reverse = new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
            reverse.append(words[i]);

            if(i>0){
                reverse.append(" ");
            }
        }
        return reverse.toString();
    }
}
