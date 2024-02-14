class TwoDArrayExample
{

	public static void main(String args[])
	{
	 	int r,c,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num of row");
		r=sc.nextInt();
		System.out.println("Enter the num of column");
		c=sc.nextInt();
		int a[][]=new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();	
			}
		}
		System.out.println("printing 2d array data");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.println(a[i][j]);
			}
		}

	
	}

}
