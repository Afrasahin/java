class multiArray{
		public static void main(String args[])
{
	int [] [] multiArray= {
	{1,2,3,4},
	{5,6,7,8}
};
	System.out.println("2D int array:");

	System.out.println(multiArray [0] [3]);

	for(int [] row : multiArray) {

	    for(int val : row) {

	System.out.print(val+" ");

}
	System.out.println();
}
	System.out.println();
}
}
