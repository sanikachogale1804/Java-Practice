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
		
		int ram=100;
		int shyam=70;
		
		ram+=(shyam-ram);   //100+-30
		System.out.println(ram);
		
		int sita=50;
		int geeta=2;
		sita*=(sita/geeta);    //50*25
		System.out.println(sita);
		
		int x=2;
		int y=50;
		y+=y;   //y=y+y;
		System.out.println(y);
		
		int j=98;
		int k=9;
		j%=k;    //j=j%k   98/9
		System.out.println(j);
		
		float l=105;
		float m=10;
		l/=m;    //105/10
		System.out.println(l);
		
		int n=20;
		int o=40;
		n+=o;  //n=n+o=20+40;
		n-=o;  //n=n-o=60-40=20
	    o+=n;  //o=o+n=60
		n-=o;  //20-60=-40
		System.out.println(n);
	}
}