class string9{
	String name;
	int age;
	string9(String name,int age)
{
	this.name=name;
	this.age=age;
}
	void print()
{
	System.out.println("my name is:"+this.name+"my age is:"+this.age);
}
}


class ruk{
	public static void main(String args[])
{
	string9 a=new string9("afra",21);
	a.print();
}
}
	