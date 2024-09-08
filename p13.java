import java.util.Scanner;
class p13
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("1:Add 2:Sub 3:Mul 4:div");
		int decision=sc.nextInt();
		switch(decision)
		{
			case 1:
			System.out.println(n1+n2);
			break;
			case 2:
			System.out.println(n1-n2);
			break;
			case 3:
			System.out.println(n1*n2);
			break;
			case 4:
			System.out.println(n1/n2);
			break;
			default:
			System.out.println("Invalid input");
		}
		
	}
}