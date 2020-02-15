package Array;

public class DS9_LargestSubArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45}; 
        int n = arr.length;
		
		System.out.println(findLength(arr,n));

	}
	
	public static int min(int x, int y)
	{
		return x<y?x:y;
	}
	
	public static int max(int x,int y)
	{
		return x>y?x:y;
	}
	
	
	
	// Returns length of the longest contiguous subarray 
  public static  int findLength(int arr[], int n)  
    {
    	int max_lenght=1;
    	for(int i=0;i<n-1;i++)
    	{
    		int min=arr[i];
    		int max=arr[i];
    		
    		for(int j=i+1;j<n;j++)
    		{
    			
    			min=min(min,arr[j]);
    			max=max(max,arr[j]);
    			
    			System.out.println(min+"======= "+i+","+j+" ========="+max);
    			
    			//if array continious then diff max and min
    			
    		if((max-min)==j-i)
    		{
    			System.out.println("true");
    			max_lenght = max(max_lenght, max - min + 1); 
    		}
    			
    			
    			
    		}
    		
    		
    	}
    	
    	
    return max_lenght;
    }

}
