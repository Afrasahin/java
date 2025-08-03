class array{
	public static void main(String args[])
{
	int [] a=new int[5];
	a [0]=123;
	a [1]=453;
	a [2]=789;
	a [3]=765;
	a [4]=432;

	System.out.println(a [0]);
	System.out.println(a.length);
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}