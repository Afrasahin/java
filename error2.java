class error2{

		public static void main(String args[])
{

	try{
		int a=10;
		int b=0;
		System.out.println(a/b);
		
	}catch (Exception e){
		System.out.println(e.getMessage());
		throw new RuntimeException(e);
	}finally{
			System.out.println("finally");
	
	System.out.println("continued");}
	System.out.println("the block is continued after execution");
}
}