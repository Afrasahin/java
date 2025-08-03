class stringBuffer1{
		public static void main(String args[])
{
		StringBuffer sbf=new StringBuffer("afra");

		sbf.append("sahin");

		System.out.println("append:" + sbf);

		//insert
		sbf.insert(4,"muva");
		System.out.println("insert:"+sbf);		

		//delete

		sbf.delete(8,13);
		System.out.println("delete:"+sbf);

		//replace

		sbf.replace(0,3,"sahin");
		System.out.println("replace:"+sbf);

		//deleteCharAt

		sbf.deleteCharAt(5);
		System.out.println("deleteCharAt:"+sbf);

		//reverse

		sbf.reverse();
		System.out.println("reverse:"+sbf);

		System.out.println("capacity:"+sbf.capacity());
		sbf.ensureCapacity(50);
		System.out.println("After ensureCapacity(50):"+sbf.capacity());

		sbf.length();
		System.out.println("length:"+sbf.length());
		sbf.setLength(20);
		System.out.println("setLength(20):"+sbf.length());

		sbf.setCharAt(0,'z');
		System.out.println("setCharAt(0,'z'):"+sbf);

		System.out.println("charAt(2):"+sbf.charAt(2));
		System.out.println("substring(1,4):"+sbf.substring(1,4));
		System.out.println("toString:"+sbf.toString());

}
}