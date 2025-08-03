class object{
	private String name;
	private int age;
	public String getname()
{
	return this.name;
}
	public void setname(String name)
{
	this.name=name;
}
}



class zayan{
	public static void main(String args[])
{
	object a=new object();
	a.setname("who");
	System.out.println(a.getname());
}
}