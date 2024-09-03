import java.util.Scanner;
class p4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		boolean subscribed=false;
		System.out.println("Do you want to subscribe??Y/N");
		char decision=sc.next().charAt(0);
		
		if(decision=='Y' || decision=='y')
		{
			subscribed=true;
		}
		System.out.println(subscribed+" subscribed");
		
		if(subscribed)
		{
			System.out.println("you are subscribed");
		}
		else
		{
			System.out.println("you are not subscribed");
		}
			
	}
}