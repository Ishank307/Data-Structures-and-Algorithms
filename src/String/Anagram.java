package String;


import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.isAnagram("listen", "silent")); // Example usage
        System.out.println(solution.isAnagram("rag", "cat")); // Example usage
    }
}

class Solution2 {
    public boolean isAnagram(String s, String t) {
        // Solution implementation

        HashMap<Character,Integer> sAnagram=new HashMap<>();
        HashMap<Character,Integer> tAnagram=new HashMap<>();

        for(char c:s.toCharArray()){
            sAnagram.put(c,sAnagram.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){

            tAnagram.put(c,tAnagram.getOrDefault(c,0)+1);
        }

        for(char c: s.toCharArray()){
            if(!tAnagram.containsKey(c)){
                return false;
            } else if (tAnagram.containsKey(c)) {
                if(tAnagram.get(c)!=sAnagram.get(c))
                    return false;
            }
        }

        return true;
    }
}