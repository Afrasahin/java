class whilerev4{
	public static void main(String args[])
{
	int a=141,a1=a;
	int b=0;
while(a>0)
{
	b=b*10+a%10;
	a/=10;
}
	System.out.println(b);
if(b==a1)
{
	System.out.println("palindrome");
}
else{
	System.out.println("or not");
}	
}
}

