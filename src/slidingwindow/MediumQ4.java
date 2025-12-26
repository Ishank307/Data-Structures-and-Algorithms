package slidingwindow;

public class MediumQ4 {

    public int characterReplacement(String s,int k) {
        int left = 0;
        int maxFreq = 0;
        int[] freq=new int [26];
        int result = 0;

        for (int right = 0; right < s.length(); right++) {

            freq[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right)-'A']);


            while ((right-left+1) - maxFreq > k) {
                freq[s.charAt(left)-'A']--;
                left++;
            }

            result = Math.max(result, (right-left+1));

        }
        return result;
    }

    public static void main(String[] args) {
        String a="AABBABB";
        MediumQ4 m=new MediumQ4();
        int answer=m.characterReplacement(a,1);

        System.out.println(answer);

    }
}


