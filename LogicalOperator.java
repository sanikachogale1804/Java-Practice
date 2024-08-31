class LogicalOperator
{
	public static void main (String args[])
	{
		int a=50;
		System.out.println(a==50 && a!=50);
		System.out.println(a<=0 && a!=50);
		System.out.println(a>=0 && a==50);
		System.out.println(a<=0 || a>=0);
		System.out.println(a<=50 || a<=0);
		System.out.println(!(a<=50 || a<=0));
		
		int b=30;
		int c=70;
		System.out.println(b<=c && b>=c);
		System.out.println(b==c || b!=c);
		System.out.println(!(b<=a && a!=b));
	}
}