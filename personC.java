class personF{
	String name;
	int age;
	personF(String name,int age)
{
	this.name=name;
	this.age=age;
}
	void print()
{
	System.out.println("my name is:"+this.name+"my age is:"+this.age);
}
}






class data1 extends personF{
	String place;
	int salary;
	data1(String name,int age,String place,int salary)
{
	super(name,age);
	this.place=place;
	this.salary=salary;
}
	void print()
{
	System.out.println("i am from:"+this.place+"i am expected:"+this.salary);
}
}





class String1 extends data1{
	String degree;
	String collage;
	String1(String name,int age,String place,int salary,String degree,String collage)
{
	super(name,age,place,salary);
	this.degree=degree;
	this.collage=collage;
}
	void print()
{
	System.out.println("my name is:"+this.name+"my age is:"+this.age+"i am from:"+this.place+"i am expected:"+this.salary+"i am completed:"+this.degree+"i am studying:"+this.collage);
}
}




class personC{
	public static void main(String args[])
{
	String1 afra=new String1("afrasahin",21,"thanjavur",10000,"B.C.A","Anna university");
	
	afra.print();
}
}