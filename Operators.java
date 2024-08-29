class operators
{
	public static void main (String args[])
	{
		int i=10;
		i++;
		i++;
		i--;
		i++;
		System.out.println(i);
		
		int j=10;
		j++;
		j++;
		System.out.println(++j);
			
		int a=20;
		a++;
		a++;
		a--;
		System.out.println(++a);
		
		
		int b=30;
		b++;
		b--;
		b--;
		b++;
		System.out.println(--b);
		
		int c=20;
		c++;   //21
		c--;  //20
		c++;  //21
		c--;  //20
		c--;  //19
		c--;  //18
		System.out.println(c++);
		
		int d=10;
		d++;
		d++;
		d--;
		d--;
		d++;
		d--;
		d++;
		System.out.println(d++);
		
		int e=30;
		e++;//31
		e--;//30
		e++;//31
		e++;//32
		e--;//31
		e--;//30
		e--;//29
		System.out.println(e--);
	}
}