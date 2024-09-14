import java.util.Scanner;
class while3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int digitcount=0;
		
		while(n!=0)
		{
			n=n/10;
			digitcount++;
		}
		System.out.println(digitcount);
		
		if(digitcount>4)
		{
			System.out.println("number is large");
		}
		else
		{
			System.out.println("number is small");
		}
	}
}