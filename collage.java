class inheritance{
	public void add(String name,int fees)
{
	System.out.println(name);
	System.out.println(fees);
}
}


class obj extends inheritance{
	public void add1(String year,int fees1)
{
	System.out.println(year);
	System.out.println(fees1);
}
}


class collage{
	public static void main(String args[]){
	obj a=new obj();
	a.add("anna university",75000);
	a.add1("first",25000);
}
}