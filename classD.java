class classC
{
	String name;
	String name1;

	void System(String name,String name1)
{
	this.name=name;
	this.name1=name1;
}
	void print()
{
	System.out.println("my name is:"+this.name+" his name is:"+this.name1);
}
}


class classD{
	public static void main(String args[])
{
	classC zasra=new classC();
	zasra.System("zasrasahin","eiman zehra");
	zasra.print();
}
}