class whilerev{
		public static void main(String args[])
{
		int a=123;
		int c=0;
while(a>0)
{
	c=c*10+a%10;
	a/=10;
}
	System.out.println(c);
}
}