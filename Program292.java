import java.util.*;

class Marvellous
{
	public int Addition(int a, int b, int c)
	{
		int iSum = 0;
		iSum = a + b + c;
		return iSum;	
	}
}

class Program292
{
	public static void main(String a[])
	{
		Marvellous mobj = new Marvellous();
		int ret = mobj.Addition(11,21,51);
		System.out.println("Addition si :"+ret);
	}
}






