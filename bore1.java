class intresting{
	private String name;
	private int age;
	public string getname()
{
	return this.name;
}
	public void setname(String name)
{
	this.name=name;
}
	public int getage()
{
	return this.age;
}
	public void setage(int age)
{
	this.age=age;
}
}




class bore1 extends intresting{
		public static void main(String args[])
{
		bore1 a=new bore1();
		a.setname("afrasahin");
		System.out.println(a.getname());
		a.setage(17);
		System.out.println(a.getage());
}
}