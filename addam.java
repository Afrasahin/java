class addam{
		public static void add(int a)
{
	
		int a1=0;
while(a>0)
{
	a1=a1*10+a%10;
	a/=10;
}
	System.out.println(a1);
}
	public static void main(String args[])
{
	add(12);
}
}
	