class method1{
	public static void great(int a,int b,int c,int d,int e){
	System.out.println(a>b&&a>c&&a>d&&a>e?"A is greater than of all":"a is not eligible");
}
	public static void greatb(int a,int b,int c,int d,int e){
	System.out.println(b>a&&b>c&&b>d&&b>e?"B is greater than of all":"b is not eligible");
}
	public static void greatc(int a,int b,int c,int d,int e){
	System.out.println(c>a&&c>b&&c>d&&c>e?"C is greater than of all":"c is not eligible");
}
	public static void greatd(int a,int b,int c,int d,int e){
	System.out.println(d>a&&d>b&&d>c&&d>e?"D isgreater than of all":" d is not eligible");
}
	public static void greate(int a,int b,int c,int d,int e){
	System.out.println(e>a&&e>b&&e>c&&e>d?"E is greater than of all":"e is not eligible");
}
	public static void main(String args[]){
	great(67,98,987,56,43);
	greatb(45,87,987,56,32);
	greatc(67,89,765,98,56);
	greatd(56,43,986,90,145);
	greate(56,76,89,456,34);
}
}