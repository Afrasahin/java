class personK{
	String name;
	int age;
	public personK(String name,int age)
{
	this.name=name;
	this.age=age;
}
	void print()
{
	System.out.println("my name is:"+this.name+"my age is:"+this.age);
}
}









class classO extends personK{
	
	String place;
	int salary;
	String degree;
	public classO(String name,int age,String place,int salary,String degree)
{
	super(name,age);
	this.place=place;
	this.salary=salary;
	this.degree=degree;
}
	void print()
{
	System.out.println("my name is:"+this.name+"my age is:"+this.age+"i am from:"+this.place+"expected salary:"+this.salary+"i am completed:"+this.degree);
}
}


class personM{
	public static void main(String args[])
{
	classO zasra=new classO("zasrasahin",21,"thanjavur",10000,"B.c.a");

	zasra.print();
	
}
}