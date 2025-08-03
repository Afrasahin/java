class methodoverloading1{
	public static void add(int a,int b)
{
	System.out.println(a+b);
}
	public static void add(int a,int b,int c,int d)
{
	System.out.println(a+b+c+d);

}
	public static void great(int a,int b)
{
	System.out.println(a>b?"A is greater than B":"B is greater than A");
}
public static void main(String args[]){
	add(78,76);
	add(98,87,89,76);
	great(87,98);
}
}