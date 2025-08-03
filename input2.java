import java.util.Scanner;


class input2{
	public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the value A:");

	int a=scan.nextInt();

	System.out.println("Enter the value B:");

	int b=scan.nextInt();

	System.out.println(a);
	
	System.out.println(b);

	for(int i=1;i<a;i++);
{
	for(int j=0;j<b;j++);
{
	System.out.println(i+" "+j);
}
}
