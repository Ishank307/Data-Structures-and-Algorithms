package isha;


public class optimizedZero {

    public static void moveZeroes(int[] nums) {
        int end = nums.length-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                swap(nums,i,end);
                end--;
            }
        }

    }

    static private int[] swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);

        // Print result (optional)
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

