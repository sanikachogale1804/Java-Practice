import java.util.Scanner;
class p11
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		if(n%3==0)
		{
			System.out.println("multiple of 3");
		}
		else
		{
			System.out.println("not multiple of 3");
		}
	}
}