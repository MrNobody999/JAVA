import java.util.*;

class Program274
{
	public static void main(String str[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter string");
		String s = sobj.nextLine();

		System.out.println("Entered string is : "+s);
		System.out.println("Length of string is : "+s.length());

		String s1 = s.trim();

		System.out.println("New string is : "+s1);
		System.out.println("Length of new string is :"+s1.length());
	}
}






