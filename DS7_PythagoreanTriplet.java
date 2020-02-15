package Array;

public class DS7_PythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[] = { 3, 1, 4, 6, 5 }; 
		 
		System.out.println( isTriplet(arr));

	}
	
	public static boolean isTriplet(int arr[]) {
		
		int n=arr.length;
		
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					int x=arr[i]*arr[i];
					int y=arr[j]*arr[j];
					int z=arr[k]*arr[k];
					
					if(x+y==z|| y+z==x||z+x==y)
						return true;
				}
			}
			
		}
		
		
		
		return false;
	}


}
