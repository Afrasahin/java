class stringBuffer3{
		public static void main(String args[])
{
		StringBuffer sbf=new StringBuffer("afra");

		sbf.append("sahin");

		System.out.println(sbf);

		//insert
		sbf.insert(4,"muva");

		System.out.println(sbf);
		

		if(sbf.equals("afra"))
		{
			
			System.out.println("true");
	
		}
		
		else{

			System.out.println("false");
		}
		for(int i=0;i<=13;i++)
		{
			System.out.println(sbf.charAt(i));
		}

		int i=15;

		while(i<=14)
		{
			System.out.println(sbf.charAt(i));
		}
		}
		}
	