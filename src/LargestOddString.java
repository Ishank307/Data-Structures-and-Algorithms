import java.util.*;

public class LargestOddString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.nextLine();
        String result = solution.largestOddNumber(num);
        System.out.println("Largest odd digit: " + result);
        sc.close();
    }
}

class Solution {
    public String largestOddNumber(String num) {
        int number = Integer.parseInt(num);
        int max = Integer.MIN_VALUE;

        while (number != 0) {
            int res = number % 10;
            if (res % 2 != 0) {
                max = Math.max(res, max);
            }
            number = number / 10;
        }

        // handle case where no odd digit is found
        if (max == Integer.MIN_VALUE) {
            return "-1";
        }

        return Integer.toString(max);
    }
}
