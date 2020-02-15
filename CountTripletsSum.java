package Array;

public class CountTripletsSum {
	
	static int arr[] = new int[]{5, 1, 3, 4, 7}; 
	
	public static void main(String[] args) {
		countTriplets(arr,12);
	}
	
	public static void countTriplets(int arr[],int sum)
	{
		int n=arr.length;
		int count=0;
		
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					
					if(arr[i]+arr[j]+arr[k]<sum)
						count++;
				}
			}
		}
		
		System.out.println("total count=="+count);
		
	}

}


//===========================another method=================================
