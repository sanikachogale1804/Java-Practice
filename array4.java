import java.util.Scanner;
class array4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String weekdays[]={"mon","tue","wed","thur","fri","sat","sun"};
		
		System.out.println(weekdays.length);
		System.out.println(weekdays[0]);
		
		int numbers[]={12,45,67,87,98,36};
		
		System.out.println(numbers.length);
		System.out.println(numbers[0]);
		System.out.println("===============================");
		int sum=0;
		for(int n:numbers)
		{
			sum=sum+n;
			System.out.println(n);
		}
		System.out.println(sum);
	}
}