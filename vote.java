import java.util.Scanner;
class vote{
	public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);	
System.out.println("enter your name:");
String name=scan.nextLine();
System.out.println("enter your age:");
int age=scan.nextInt();
scan.nextLine();
System.out.println("enter your place:");
String place=scan.nextLine();

if(age>18)
{
	if(place.equals("mayilduthurai"))
	{
		System.out.print("place is matching");
	}
	System.out.print("Eligible for working");
}
else
{
System.out.println("Not eligible for working");
}
}
}