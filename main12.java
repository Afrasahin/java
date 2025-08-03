abstract class java{
	abstract void student();
}


class python extends java{
	
	public void add(int a,int b)
{
	System.out.println(a>b);
}
	public void student()
{
	System.out.println("new people");
	}
}

class main12{
	public static void main(String args[])
{
	python a=new python();
	a.student();
	a.add(87,65);

}
}