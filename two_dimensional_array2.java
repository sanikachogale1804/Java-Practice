class two_dimensional_array2
{
	public static void main(String args[])
	{
		int arr[][]={{12,34},{45,67,78},{56,35,78,90}};
		
		/*for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(arr[i][j]);
			}
		}*/
		
		/*for(int a[]:arr)
		{
			for(int numbers:a)
			{
				System.out.println(numbers);
			}
		}*/
		
		String courses[][]={{"HTML","CSS","JAVASCRIPT"},{"COREJAVA","SPRINGBOOT"},{"MYSQL","MONGODB"}};
		
		//System.out.println(courses[0][1]);
		System.out.println(courses.length);
		for(String ch[]:courses)
		{
			for(String cour:ch)
			{
				System.out.print(cour);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		
		
		
		
	}
}