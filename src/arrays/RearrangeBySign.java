package arrays;


public class RearrangeBySign {
    public static void main(String[] args) {
      
        
        // Test case 1
        int[] arr1 = {3, 1, -2, -5, 2, -4};
        int[] result1 = rearrangeArray(arr1);
        System.out.print("Test 1 - Input: {3, 1, -2, -5, 2, -4} -> Output: ");
        printArray(result1);
        
        // Test case 2
        int[] arr2 = {-1, 1};
        int[] result2 = rearrangeArray(arr2);
        System.out.print("Test 2 - Input: {-1, 1} -> Output: ");
        printArray(result2);
        
        // Test case 3
        int[] arr3 = {1, 2, 3, -1, -2, -3};
        int[] result3 = rearrangeArray(arr3);
        System.out.print("Test 3 - Input: {1, 2, 3, -1, -2, -3} -> Output: ");
        printArray(result3);
    }
    
    
 public static int[] rearrangeArray(int[] arr) {
        
        int[] pos = new int[(arr.length)/2];
        int[] neg = new int[(arr.length)/2];
        int j = 0;
        int k = 0;
        
        // Separate positive and negative numbers
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                pos[j++] = arr[i];
            }
            if(arr[i] < 0){
                neg[k++] = arr[i];
            }
        }

        // Reset counters
        j = 0;
        k = 0;
        int i = 0;
        
        // Alternate positive and negative numbers
        while(i < arr.length){
            arr[i++] = pos[j++];
            arr[i++] = neg[k++];
        }
        
        return arr;
    }
    
    // Helper method to print array
    public static void printArray(int[] arr) {
        System.out.print("{");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}