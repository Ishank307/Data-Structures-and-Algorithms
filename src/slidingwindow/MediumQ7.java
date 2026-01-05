package slidingwindow;

import java.util.HashMap;

public class MediumQ7 {

    public static void main(String[] args) {
        main sol = new main();

        String s1 = "abcabc";
        System.out.println(sol.numberOfSubstrings(s1)); // expected 10
        s1.length();
        String s2 = "aaacb";
        System.out.println(sol.numberOfSubstrings(s2)); // expected 3

        String s3 = "abc";
        System.out.println(sol.numberOfSubstrings(s3)); // expected 1
    }
}

class main {

    public int numberOfSubstrings(String s) {
        int n = s.length();
        int [] freq = new int[3];
        int left =0;
        int count = 0;
        for (int right=0;right<n;right++){
            freq[s.charAt(right)-'a']++;
            while(freq[0]>0 && freq[1]>0&& freq[2]>0){
                count+=n-right;
                freq[s.charAt(left)-'a']--;
                left++;
            }
        }
        return count;
    }
}
