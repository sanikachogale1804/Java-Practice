import java.util.Scanner;
class p3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		System.out.println("value given by user:"+a);
		
		System.out.println("Enter String");
		String name=sc.next();
		System.out.println("My name is :"+name);
		
		System.out.println("Enter String");
		String sentence=sc.nextLine();
		System.out.println("sentence is:"+sentence);
		
		int age=sc.nextInt();
		System.out.println("age is:"+age);
		
		int c=sc.nextInt();
		int d=sc.nextInt();
		System.out.println(c-d);
	}
}