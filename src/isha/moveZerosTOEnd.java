package isha;

public class moveZerosTOEnd {

    public static int[] moveZeroes(int[] nums) {
        // TODO: implementation here

        int[] arr= new int [nums.length];
        int count=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }

            if(nums[i]!=0){
                arr[j++]=nums[i];
            }
        }

        for(int i=0;i<count;i++){
            arr[j++]=0;
        }

        return arr;



    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        arr=moveZeroes(arr);

        // Print output (optional)
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
