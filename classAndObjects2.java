class product
{
	int id;
	String name;
}



class classAndObjects2
{
	public static void main(String args[])
	{
		product p1=new product();
		product p2=new product();
		p1.id=1;
		p1.name="mobile";
		
		System.out.println(p1.id);
		System.out.println(p1.name);
		
		p2.id=2;
		p2.name="laptop";
		
		System.out.println(p2.id);
		System.out.println(p2.name);
		
	}
}