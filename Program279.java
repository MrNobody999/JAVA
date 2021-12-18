import java.util.*;

class Program279
{
	public static void main(String str[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter string");
		String s = sobj.nextLine();

		String s2 = s.trim().replaceAll("[ ]{2,}"," ");
		
		String Arr[] = s2.split(" ");

		for(int i = 0; i < Arr.length; i++)
		{
			System.out.println(Arr[i]);
		}
	}
}






