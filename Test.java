class Test
{
	public static void main(String args[])
	{
	    /*	
		int a=10;
		System.out.println(++a - a++ - a-- + ++a - a-- - --a + a++ + a++ - a-- + a++ + ++a);
	   */

	/*	int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		for(int i=n-1; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	*/

/*	int x=9, y=12;
	int a=2, b=4, c=6;
	int exp=(3 + 4 * x)/5-10 * (y-5) * (a+b+c)/x+9 * (4/x + (9 + x)/y);
	
	System.out.println(exp);
*/
	/*	
		int x=200, y=50, z=100;
		if(x>y && y>z)
		{
			System.out.println("hello");
		}
		if(z>y && z<x)
		{
			System.out.println("java");
		}
		if((y+200)<x && (y+150)<z)
		{
			System.out.println("hello java");
		}
	*/

		int x=1,y=2,z=5;
		System.out.println("x: " +(!((x+2)==(1+2))));
		
		System.out.println("y: "+(!(y==z)));
		System.out.println("z>x:" +(!(z>x)));
		
		if(!(x==y)&&((y+5)>z) && (!((z-3)==0)))
		{
			System.out.println("Hello");
		}
	
	
	}
}