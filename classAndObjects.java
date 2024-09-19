class student
{
	int rollNo;
	String name;
	String add;
}


class classAndObjects
{
	public static void main(String args[])
	{
		student s1=new student();
		student s2=new student();
		student s3=new student();
		s1.rollNo=101;
		s1.name="sanika";
		s1.add="xyz";
		
		s2.rollNo=102;
		s2.name="sneha";
		s2.add="ghf";
		
		s3.rollNo=103;
		s3.name="akshata";
		s3.add="ghatkopar";
		
		System.out.println(s1.rollNo);
		System.out.println(s1.name);
		System.out.println(s1.add);
		
		System.out.println(s2.rollNo);
		System.out.println(s2.name);
		System.out.println(s2.add);
		
		System.out.println(s3.rollNo);
		System.out.println(s3.name);
		System.out.println(s3.add);
	}
}