abstract class collage1{
	abstract void student();
}


class passion extends collage1{
	public void student()
{
	System.out.println("memories");
}
	public void add(String name)
{
	System.out.println(name);
}
	public void add1(int fees)
{
	System.out.println(fees);
}
	public void add2(int fees1)
{
	System.out.println(fees1);
}
	public void add3(String place)
{
	System.out.println(place);
}
	public void add4(String senior)
{
	System.out.println(senior);
}
	public void add7(String degree)
{
	System.out.println(degree);
}
	public void add9(String result)
{
	System.out.println(result);
}
}


class favourite{
	public static void main(String args[])
{
	passion a=new passion();
	a.student();
	a.add("srm university");
	a.add1(75000);
	a.add2(56000);
	a.add3("chennai");
	a.add4("no one");
	a.add7("Aerounatic");
	a.add9("average");
}
}
	
	