import java.util.Scanner;

class input1{
	public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the value A:");

	 int a=scan.nextInt();

	System.out.println(a);

	scan.nextLine();

	System.out.println("Enter the name:");

	String name=scan.nextLine();

	System.out.println("Enter the age:");

	int age=scan.nextInt();

	scan.nextLine();

	System.out.println("Enter the place:");

	String place=scan.nextLine();

	System.out.println(place);

	System.out.println(name);

	System.out.println(age);

	for(int i=1;i<a;i++)
{
	System.out.println(i);

	for(int j=0;j<a;j++)
{
	System.out.println(i+" " +j);
}
}
if(age>17)
{
	System.out.println("it is eligible");

}
else{
	System.out.println("it is not eligible");
}
if(name!=("afra"))
{
	System.out.println("the age is supported and the name is supported");
}
else{
	System.out.println("the age is supported but the name is not supported");
}
if(place!=("mayilai"))
{
	System.out.println("the age is supported and the place is supported");
}
else{
	System.out.println("the age is supported but the place is not supported");

}
}
}
