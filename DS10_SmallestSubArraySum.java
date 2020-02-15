package Array;

public class DS10_SmallestSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {1, 4, 45, 6, 10, 19}; 
        int x = 51; 
        int n1 = arr1.length; 
        int res1 = smallestSubWithSum(arr1, n1, x); 
        if (res1 == n1+1) 
           System.out.println("Not Possible"); 
        else
           System.out.println(res1); 

	}
	
	static int smallestSubWithSum(int arr[], int n, int x) 
    { 
     int min_len=n+1;
     
     for(int i=0;i<n;i++)
     {
    	 int curr_sum=arr[i];
    	 if(curr_sum>arr[i])
    		 return 1;
    	 
    	 for(int j=i+i;j<n;j++)
    	 {
    		 curr_sum+=arr[j];
    		 if (curr_sum > x && (j - i + 1) < min_len) 
                 min_len = (j - i + 1); 
    	 }
    	 
    	 
     }
     
     return min_len;
    }

}
