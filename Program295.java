import java.util.*;

class Marvellous
{
	public int Addition(int ... a)
	{
		int isum = 0;
		for(int no : a)
		{
			isum = isum + no;
		}
		return isum;
	}
}

class Program295
{
	public static void main(String a[])
	{
		Marvellous mobj = new Marvellous();
		int iret = mobj.Addition(11,21,51,101,111);
		System.out.println("Addion is : "+iret);
	}
}






