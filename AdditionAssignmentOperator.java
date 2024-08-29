class AdditionAssignmentOperator
{
	public static void main (String args[])
	{
		int a=4;
		int b=2;
		
		a+=b;  //a=a+b
		System.out.println(b);
		
		int c=30;
		int d=20;
		
		d+=c;  //d=d+c=20+30
		c+=d;  //c=c+d=30+20
		d+=c;  //d=d+c=20+30
		System.out.println(d);
		
		int e=5;
		int f=4;
		
		f-=e; 
		e-=f;
		System.out.println(f+e);
		
	}
}