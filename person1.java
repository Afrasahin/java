class person{
	int age;
	String name;
	public person(String name,int age)
{
	this.name=name;
	this.age=age;
}
	void print()
{
	System.out.println("My name is:"+this.name+"my age is:"+this.age);
}
}


class person1{
	public static void main(String args[])
{
	person afra=new person("afra",17);
	
	afra.print();
}
}

	