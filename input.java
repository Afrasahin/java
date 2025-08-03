import java.util.Scanner;

class input{
	public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the name:");
	String name=scan.nextLine();
	System.out.println("Enter the value A:");
	int a=scan.nextInt();
	System.out.println("Enter the value B:");
	int b=scan.nextInt();
	scan.nextLine();
	System.out.println("Enter the name1:");
	System.out.println("Enter the name2:");
	String name2=scan.nextLine();
	String name1=scan.nextLine();
	System.out.println(a-b);
	System.out.println(name);
	System.out.println(name1);
	System.out.println(name2);
}
}