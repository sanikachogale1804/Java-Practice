import java.util.*;
class IfExample
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%9==0)
		{
			System.out.println(n+" The number is multiple of 9");
		}
		else
		{
			System.out.println(n+" The number is not multiple of 9");
		}
	}
}