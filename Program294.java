import java.util.*;

class Marvellous
{
	public void Display(int ... a)
	{
		System.out.println("Number of arguyments are : "+a.length);

		System.out.println("Input parameters are : ");
		for(int no : a)
		{
			System.out.println(no);
		}
	}
}

class Program294
{
	public static void main(String a[])
	{
		Marvellous mobj = new Marvellous();
		mobj.Display(11,21,51,101,111);
	}
}






