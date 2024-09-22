class Calculator
{
	int num1;
	int num2;
	
	int addition()
	{
		return num1+num2;
	}
	int subtraction()
	{
		return num1-num2;
	}
	void setvalue(int n1,int n2)
	{
		num1=n1;
		num2=n2;
	}
}


class p19
{
	public static void main(String args[])
	{
		Calculator c1=new Calculator();
		c1.num1=20;
		c1.num2=10;
		//System.out.println(c1.num1+c1.num2);
		int sum=c1.addition();
		System.out.println("addition is:"+sum);
		System.out.println(sum>100);
		
		Calculator c2=new Calculator();
		c2.setvalue(100,50);
		System.out.println(c2.num1+" "+c2.num2);
		System.out.println(c1.num1-c1.num2);
	}
}