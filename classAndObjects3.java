class Product 
{
	int id;
	String name;
	int price;
	
	void productdetails()
	{
		System.out.println("product details");
	}
	
}

class classAndObjects3
{
	public static void main(String args[])
	{
    Product p1=new Product();
	p1.id=1;
	p1.name="laptop";
	p1.price=20000;
	
	System.out.println(p1.id);
	System.out.println(p1.name);
	System.out.println(p1.price);
	
	p1.productdetails(id);
	
	}
}