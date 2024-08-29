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
		
		f-=e; //f=f-e=4-5=-1
		e-=f; //e=e-f=5-4=1
		System.out.println(f+e);
		
		int g=20;
		int h=10;
		
		g-=h;
		h-=g;
		System.out.println(h);
		
	}
}