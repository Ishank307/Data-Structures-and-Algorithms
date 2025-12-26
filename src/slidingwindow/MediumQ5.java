package slidingwindow;
public class MediumQ5 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal)-atMost(nums,goal-1);
    }

    public static int atMost(int[]nums,int goal){

        int left=0;
        int count=0;
        int sum=0;

        for(int right=0;right<nums.length;right++){

            sum+=nums[right];
            while(sum>goal){
                sum-=nums[left];
                left++;
            }

            count+=(right-left+1);

        }
        return count;
    }
    public static void main(String[] args) {

        int[] arr={1,0,1,0,1};

        MediumQ5 m2=new MediumQ5();
        int result=m2.numSubarraysWithSum(arr,2);

        System.out.println(result );
    }
}