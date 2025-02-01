class swap1
{
 	public static void main(String args[])
	{
 		int a=10 ,b=20;
		b=b+a;
		a=b-a;
		b=b-a;
		System.out.println(a);
  		System.out.println(b);
	}
}