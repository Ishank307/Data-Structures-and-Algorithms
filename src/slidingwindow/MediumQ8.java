package slidingwindow;

public class MediumQ8 {

    public int maxScore(int[] cardPoints, int k) {
//        int left=0;
//        int right=cardPoints.length-1;
//
//        int sum=0;
//
//
//        while(k>0){
//            if(cardPoints[left]>cardPoints[right]){
//                sum+=cardPoints[left];
//                k--;
//                left++;}
//            else if (cardPoints[right]>cardPoints[left]) {
//                sum+=cardPoints[right];
//                right--;
//                k--;
//            }
//            else if(cardPoints[left]==cardPoints[right]){
//                if(cardPoints[left+1]>cardPoints[right-1]){
//                    sum+=cardPoints[left];
//                    k--;
//                    left++;
//                }
//                else{
//                    sum+=cardPoints[right];
//                    right--;
//                    k--;
//
//                }
//            }
//        }
//
//        return sum;


        int total_sum=0;

        int n= cardPoints.length;
        if (k>n) return 0;
        int size=n-k;
        for(int i=0;i<n;i++){
            total_sum+=cardPoints[i];
        }
        if(size==0) return total_sum;

        int ans=Integer.MIN_VALUE;
        int current_sum=0;
        int left=0;
        for (int i=0;i<n;i++){
            current_sum+=cardPoints[i];
            if(i>=size-1){
                ans=Math.max(ans,total_sum-current_sum);
                current_sum-=cardPoints[left];
                left++;
            }
        }

    return ans;
    }

    public static void main(String[] args) {
        int[] arr  = {1, 2, 3, 4, 5, 6, 8, 1};
        int[] arr2 = {2, 2, 2, 2};
        int[] arr3 = {2, 4, 6, 8};

        MediumQ8 obj = new MediumQ8();

        System.out.println(obj.maxScore(arr, 3));
        System.out.println(obj.maxScore(arr2, 2));
        System.out.println(obj.maxScore(arr3, 2));
    }
}
