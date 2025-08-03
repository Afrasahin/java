abstract class vehicle{
	abstract void speed();
}


class bike extends vehicle{

	public void brand()
{
	System.out.println("Hyundai");
}
	public void speed()
{
	System.out.println("Tata");
}
}


class car{
	public static void main(String args[])
{
	bike a=new bike();
	a.brand();
	a.speed();
}
}