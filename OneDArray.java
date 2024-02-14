class OneDArray
{
	public static void main(String args[])
	{
	 	int n, i;
		Scanner s=new Scanner(System.in);
		System.out.println(“Enter the number of the element”);
		n=s.nextInt();
		int a[]=new int[n];
		for( i=0;i<n;i++)
		{
			a[i]=s.nextIn();
		}

		System.out.println("printing the element of array");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}

	}

}
