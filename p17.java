class Employee
{
	int empId;
	String empName;
	int salary;
	
	void setEmployeeDetails(int empId,String empName,int salary)  //parameterized function 
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		
		System.out.println(this.empId+" "+this.empName+" "+this.salary);
//this matlab System.out.println(e1  .empId+" "+e1  .empName+" "+e1  .salary);
	}
	
}
//aap jo argument call karte ho vo paramenter me store hota hai
//instance variable ko hi object ke sath likha jata hai
//this method is common for all objects this ke sath sirf instance variable likhe jate hai parameter ke sath nahi
//this current object ke liye kam karta hai

class p17
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.setEmployeeDetails(101,"sanika",30000); //argument
		
		Employee e2=new Employee();
		e2.setEmployeeDetails(102,"sneha",30000);
		
		Employee e3=new Employee();
		e3.setEmployeeDetails(103,"akshata",20000);
	}
}