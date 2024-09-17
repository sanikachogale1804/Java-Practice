import java.util.Scanner;
class dowhile1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		do
		{
			System.out.println("Hello");
		    n=sc.nextInt();
			n++;
			n++;
		}while(n<=5);
	}
}