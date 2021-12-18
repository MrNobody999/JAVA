import java.util.*;

class Program278
{
	public static void main(String str[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter string");
		String s = sobj.nextLine();

		System.out.println("Entered string is : "+s);
		System.out.println("Length of string is : "+s.length());

		String s2 = s.trim().replaceAll("[ ]{2,}"," ");
		
		System.out.println("New string is : "+s2);
		System.out.println("Length of new string is :"+s2.length());
	}
}






