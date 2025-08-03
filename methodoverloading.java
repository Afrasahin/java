class methodoverloading{
	public static void add(int a,int b)
{
	System.out.println(a+b);
}
	public static void add(int a,int b,int c)
{
	System.out.println(a+b+c);
}
	public static void add(double a,double b)
{
	System.out.println(a+b);
}
	public static void main(String args[])
{
	add(76,98);
	add(87,90,76);
	add(76.6,98.7);
}
}