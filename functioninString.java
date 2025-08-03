class functioninString{
	public static void  main(String args[])
{
	String str="  Hello java world  ";
	String str2="hello java world";

	System.out.println("length:" + str.length());

	System.out.println("charAt:" + str.charAt(2));

	//d lastIndexof

	System.out.println("index('j'):" + str.indexOf('j'));

	System.out.println("index('l'):" + str.indexOf('l'));

	System.out.println("substring(2,7): " + str.substring(2,7));

	//replaceAll
	System.out.println("replace('l','*'): " + str.replace('l','*'));

	System.out.println("replaceAll('\\\\s+','-'):"+str.replaceAll("\\s+","-"));

	//equalsIgnoreCase

	System.out.println("equals:" +str.equals(str2));

	System.out.println("equalsIgnoreCase:" +str.trim().equalsIgnoreCase(str2.trim()));

	//CompareTo and compareToIgnoreCase

	System.out.println("compareTo:"+str.compareTo(str2));
	System.out.println("compatrToIgnoreCase:"+str.compareToIgnoreCase(str2));

	//concat

	System.out.println("concat:" +str.concat("-let's learn!"));

	String joined=String.join("java","python","c++");
	System.out.println(joined);

	System.out.println(str.trim());
	System.out.println(str.strip());
	System.out.println(str.stripLeading());
	System.out.println(str.stripTrailing());
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
	System.out.println(str.isEmpty());
	System.out.println(str.isBlank());
}
}