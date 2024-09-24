class Constructor1
{
	int Id;
	String Name;
	int Price;
	static String principle="pawar";
	
	Constructor1()
	{
		System.out.println("Object will created:");
	}
	
	Constructor1(int Id,String Name,int Price)
	{
		this.Id=Id;
		this.Name=Name;
		this.Price=Price;
	}
	void setdetails(int Id,String Name,int Price)
	{
		this.Id=Id;
		this.Name=Name;
		this.Price=Price;
		System.out.println(this.Id+" "+this.Name+" "+this.Price+" ");
	}
	
}


class Constructor
{
	public static void main(String args[])
	{
		Constructor1.principle="mane";
		Constructor1 c1=new Constructor1();
		c1.setdetails(102,"clothes",50000);
		Constructor1 c2=new Constructor1();
		Constructor1 c3=new Constructor1(101,"electronics",400000);
		System.out.println(c3.Id);
		System.out.println(c3.Name);
		System.out.println(c3.Price);
        System.out.println(c2.principle);	

        
	}
}