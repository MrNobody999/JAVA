import java.util.*;

class Marvellous
{
	public void CharFrequency(String s)
	{
		String s2 = s.replaceAll(" ","");
		System.out.println("String after removing the whitespace is : "+s2);

		char Arr[] = s2.toCharArray();

		System.out.println("Character array : ");
		for(char ch : Arr)
		{
			System.out.println(ch);
		}
	}
}

class Program284
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter string");
		String s = sobj.nextLine();

		Marvellous mobj = new Marvellous();
		mobj.CharFrequency(s);
	}
}






