class stringBuilder{
		public static void main(String args[])
{
	StringBuilder  sbd=new StringBuilder("afra");

	sbd.append("sahin");

	System.out.println("append:"+sbd);

	//replace

	sbd.replace(4,9,"muva");
	System.out.println("replace:"+sbd);

	//delete
	sbd.delete(4,8);
	System.out.println("delete:"+sbd);

	
}
}