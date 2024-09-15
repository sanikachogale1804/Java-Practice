import java.util.Scanner;
class alphabets
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char s=sc.next().charAt(0);
		System.out.println("Enter string:");
		for(s='a';s<='z';s++)
		{
			System.out.println(s);
		}
	}
}