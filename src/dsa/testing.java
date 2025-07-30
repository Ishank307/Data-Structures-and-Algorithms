package dsa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class testing {
	    public static void reverseArray(int arr[]) {
	        int n=arr.length;
	        int j=0;
	        int[] rev= new int[n];
	        for (int i=n-1;i>=0;i--){
	            rev[j++]=arr[i];
	        }
	        
	        String ans=Arrays.toString(rev);
	        System.out.println(ans);
	    }
	    
	    public static void main(String[] args) {
			
	    	int[] arr= {1,2,4,5};
	    	
	    	reverseArray(arr);
		}

}
