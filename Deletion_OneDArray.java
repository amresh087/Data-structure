class Deletion_OneDArray
{
	public static void main(String args[])
	{
	 	int n, i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of the element");
		n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n-1]
		for( i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		// insertig element in second array
		System.out.println("Enter the index where you want to delete value");
		int m=sc.nextInt();
		System.out.println("Enter the new element value");
		int newValue=sc.nextInt();
		for(j=0;j<n-1;j++)
		{
			if(j==m){
				continue;
			}else if(j<m){  
				b[j]=a[j]
			}else{
				b[j-1]=a[j]
			}			
		}

		System.out.println("printing the element of array");
		for(i=0;i<n-1;i++)
		{
			System.out.println(b[i]);
		}

	}

}
