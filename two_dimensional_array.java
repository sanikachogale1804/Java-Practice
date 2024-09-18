class two_dimensional_array
{
	public static void main(String args[])
	{
		int arr[][]={{1,2,3},{4,9,5,8},{12,43,7,8,9}};
		int sum=0;
		
		System.out.println(arr[0][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr.length);
		System.out.println("========================");
		
		for(int i=0;i<arr.length;i++)
		{
			//dout
			for(int j=0;j<3;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
		System.out.println("========================");
		
		//enhance loop(iteration)
		
		for(int n[]:arr)
		{
			for(int numbers:n)
			{
				sum+=numbers;
				System.out.println(numbers);
				if(numbers%2==0)
				{
					System.out.println(numbers);
				}
				else
				{
					System.out.println("odd");
				}
			}
		}
		System.out.println(sum);
		
		
	}
}