class classF{
	int a=87,b=65;
	void handleget(int a,int b)
{
	this.a=a;
	this.b=b;
}
	void print()
{
	System.out.println(a>b&&b>a);
	System.out.println(a>b||b>a);
}
}


class person6{
	public static void main(String args[])
{
	classF num=new classF();
	num.handleget(21,54);
	num.print();
}
}