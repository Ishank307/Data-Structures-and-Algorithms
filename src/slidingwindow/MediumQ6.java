package slidingwindow;

public class MediumQ6 {

    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        int left = 0;
        int oddCount = 0;
        int result = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] % 2 != 0) {
                oddCount++;
            }

            while (oddCount > k) {
                if (nums[left] % 2 != 0) {
                    oddCount--;
                }
                left++;
            }

            result += (right - left + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        MediumQ6 m6 = new MediumQ6();
        int[] arr = {2, 2, 1, 2, 1, 2, 2, 2};
        System.out.println(m6.numberOfSubarrays(arr, 2));
    }
}
