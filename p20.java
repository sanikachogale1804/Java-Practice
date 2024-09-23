class Product
{
	int id;
	String name;
	
	void setvalue()
	{
		System.out.println("detaile:");
	}
}

class p20
{
	public static void main(String args[])
	{
		Product p1=new Product();
		p1.id=101;
		p1.name="laptop";
		
		System.out.println(p1.id);
		System.out.println(p1.name);
		p1.setvalue();
		
		
	}
}