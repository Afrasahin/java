class lop{
	public static void main(String args[]){
 	int a=9,b=7,c=8;
	boolean ans=a>b&&a>c;
	System.out.println("A is greater than both"+(ans));
	System.out.println(a>b&&b>a);
	System.out.println(a>c&&c>a);
	System.out.println(b>c&&c>b);
	boolean ans1=a>b&&a>c;
	boolean ans2=b>a&&b>c;
	boolean ans3=c>a&&c>b;
	System.out.println("B is greater  than both"+(ans2));
	System.out.println("c is greater than both"+(ans3));
	System.out.println("A is grater than both"+(ans1));
}
}
	
	