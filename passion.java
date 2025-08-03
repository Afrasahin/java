               class passion{
	public static int rev(int a)
	{
		int a1=0;
		while(a>0)
		{
			a1=a1*10+a%10;
			a/=10;
		}
			return a1;
	}

	public static int square(int a)
	{
		return a*a;
	}
	public static void main(String args[])
{
	rev(12);
	System.out.println(c);
	square(c);
	System.out.println(d);
}}