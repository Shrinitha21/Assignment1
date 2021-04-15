package testcase;

public class Student {
	String name;
	String adress;
	int age;
	public Student() 
	{
		this.name="";
		this.adress="";
		this.age=0;
	}
	public void setInfo(int age, String name)
	{
		this.name= name;
		this.age=age;
	}
	public void setInfo(int age, String name, String adress)
	{
		this.name=name;
		this.age=age;
		this.adress=adress;
	}
	void display()
	{
		System.out.println(name+" "+age+" "+adress);
	}
	
	

}
