import java.util.Scanner;
class alphabets
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char string=sc.next().charAt(0);
		char s;
		System.out.println("Enter string:");
		for(s=string;s<='z';s++)
		{
			System.out.println(s);
		}
	}
}