public class stringBuffer{
		public static void main(String args[])
{
		System.out.println("=== StringBuffer (Thread-safe) ===");

		StringBuffer sbf = new StringBuffer("Hello");

		sbf.append("world");

		System.out.println("append: " +sbf);

		sbf.insert(6,"java");
		System.out.println("insetr:"+sbf);

		sbf.replace(6,10,"Awesome");
		System.out.println("replace:"+sbf);

		sbf.delete(6,13);
		System.out.println("delete:"+sbf);

		sbf.deleteCharAt(5);
		System.out.println("deletecharAt:"+sbf);

		sbf.reverse();
		System.out.println("reverse:"+sbf);

		System.out.println("capacity:" +sbf.capacity());
		sbf.ensureCapacity(50);
		System.out.println("After ensureCapacity(50):"+sbf.capacity());

		System.out.println("length:"+sbf.length());
		sbf.setLength(5);
		System.out.println("After setLength(5):"+sbf);

		sbf.setCharAt(1,'i');
		System.out.println("After setCharAt(1,'i'):"+sbf);

		System.out.println("charAt(2):" +sbf.charAt(2));
		System.out.println("substring(1,4):" + sbf.substring(1,4));
		System.out.println("toString():"+sbf.toString());

		
}
}